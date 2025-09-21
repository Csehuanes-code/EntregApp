package Resources.Reader;

import javax.swing.*;
import java.io.*;
import java.util.*;

public class CSVReader {
    private static BufferedReader reader;
    private static String line;

    public static int[][] createCostMatrix(String filePath) {
        // Crear un conjunto para obtener los vértices únicos
        Set<Integer> vertices = new HashSet<>();
        List<int[]> edges = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(filePath));

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length != 3) {
                    throw new IllegalArgumentException("Formato inválido en el archivo CSV: " + line);
                }

                int origin = Integer.parseInt(parts[0].trim()) - 1; // Convertir a índice base 0
                int destination = Integer.parseInt(parts[1].trim()) - 1; // Convertir a índice base 0
                int cost = Integer.parseInt(parts[2].trim());

                vertices.add(origin);
                vertices.add(destination);
                edges.add(new int[]{origin, destination, cost});
            }

            reader.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error al convertir los datos a números: " + e.getMessage());
        }

        // Crear la matriz de costos
        int vertexCount = vertices.size();
        int[][] costMatrix = new int[vertexCount][vertexCount];

        // Inicializar la matriz con valores de infinito (MAX_VALUE)
        for (int i = 0; i < vertexCount; i++) {
            Arrays.fill(costMatrix[i], Integer.MAX_VALUE);
        }

        // Llenar la matriz con los costos
        for (int[] edge : edges) {
            int origin = edge[0];
            int destination = edge[1];
            int cost = edge[2];
            costMatrix[origin][destination] = cost; // Grafo dirigido
        }

        return costMatrix;
    }
    
    public static int[][] createAdjacencyMatrix(String filePath) {
        Map<String, Integer> vertexIndex = new HashMap<>(); // Mapa para asignar índices a vértices
        List<String[]> edges = new ArrayList<>(); // Lista de aristas
        int vertexCount = 0;

        try{
            reader = new BufferedReader(new FileReader(filePath));
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(";");
                if (parts.length != 3) {
                    throw new IllegalArgumentException("Formato inválido en el archivo CSV: " + line);
                }

                String origin = parts[0].trim();
                String destination = parts[1].trim();

                // Asignar índices a los vértices si aún no tienen uno
                if (!vertexIndex.containsKey(origin)) {
                    vertexIndex.put(origin, vertexCount++);
                }
                if (!vertexIndex.containsKey(destination)) {
                    vertexIndex.put(destination, vertexCount++);
                }

                // Agregar la arista a la lista
                edges.add(new String[]{origin, destination});
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error al leer el archivo: " + e.getMessage());
        }

        // Crear la matriz de adyacencia e inicializarla con 0
        int[][] adjacencyMatrix = new int[vertexCount][vertexCount];

        // Llenar la matriz con 1 donde hay conexiones
        for (String[] edge : edges) {
            int originIndex = vertexIndex.get(edge[0]);
            int destinationIndex = vertexIndex.get(edge[1]);
            adjacencyMatrix[originIndex][destinationIndex] = 1;
        }

        return adjacencyMatrix;
    }

    public static String printMatrix(int[][] matrix) {
        String chain = "";
        for (int[] row : matrix) {
            for (int val : row) {
                if (val == Integer.MAX_VALUE) {
                    chain += " 0 ";
                } else {
                    chain += "%2d " + val;
                }
            }
            chain += "\n";
        }
        return chain;
    }
    
    /*
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int val : row) {
                if (val == Integer.MAX_VALUE) {
                    System.out.print(" ∞ ");
                } else {
                    System.out.printf("%2d ", val);
                }
            }
            System.out.println();
        }
    }
    */
}
