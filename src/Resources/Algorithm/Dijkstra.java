package Resources.Algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Dijkstra {
    static final int INF = Integer.MAX_VALUE; // Representa "infinito" para nodos no conectados

    // Método para aplicar el algoritmo de Dijkstra y obtener distancias mínimas
    private static int[] dijkstra(int[][] graph, int startVertex, int[] distances, int[] previous) {
        int vertices = graph.length;
        boolean[] visited = new boolean[vertices];

        Arrays.fill(distances, INF);
        Arrays.fill(previous, -1);
        distances[startVertex] = 0;

        for (int i = 0; i < vertices; i++) {
            int u = getMinDistanceVertex(distances, visited); // Vértice con menor distancia
            if (u == -1) break; // Si no hay vértices alcanzables

            visited[u] = true;

            // Relajación de las distancias
            for (int v = 0; v < vertices; v++) {
                if (!visited[v] && graph[u][v] != 0 && graph[u][v] != INF) { // Condiciones válidas
                    int newDist = distances[u] + graph[u][v];
                    if (newDist < distances[v]) {
                        distances[v] = newDist;
                        previous[v] = u; // Registrar el predecesor
                    }
                }
            }
        }

        return distances;
    }

    private static int getMinDistanceVertex(int[] distances, boolean[] visited) {
        int minDistance = INF, minVertex = -1;
        for (int i = 0; i < distances.length; i++) {
            if (!visited[i] && distances[i] < minDistance) {
                minDistance = distances[i];
                minVertex = i;
            }
        }
        return minVertex;
    }

    // Reconstruye el camino desde startVertex a endVertex
    private static int[] reconstructPath(int[] previous, int startVertex, int endVertex) {
        List<Integer> path = new ArrayList<>();
        for (int at = endVertex; at != -1; at = previous[at]) {
            path.add(at);
        }
        Collections.reverse(path);

        // Si el camino no inicia en startVertex, significa que no hay conexión
        if (path.get(0) != startVertex) return new int[0];

        return path.stream().mapToInt(i -> i).toArray();
    }

    // Método público para obtener el costo mínimo
    public static int getMinimumCost(int[][] graph, int startVertex, int endVertex) {
        int vertices = graph.length;
        int[] distances = new int[vertices];
        int[] previous = new int[vertices];

        // Ajustar índices para trabajar con [0, n-1]
        startVertex -= 1;
        endVertex -= 1;

        dijkstra(graph, startVertex, distances, previous);
        return distances[endVertex] == INF ? -1 : distances[endVertex];
    }

    // Método público para obtener el camino ajustado al formato de índice +1
    public static int[] getPath(int[][] graph, int startVertex, int endVertex) {
        int vertices = graph.length;
        int[] distances = new int[vertices];
        int[] previous = new int[vertices];

        // Ajustar los índices para trabajar con [0, n-1]
        startVertex -= 1;
        endVertex -= 1;

        dijkstra(graph, startVertex, distances, previous);

        // Obtener el camino y ajustarlo al formato [1, n]
        int[] path = reconstructPath(previous, startVertex, endVertex);
        for (int i = 0; i < path.length; i++) {
            path[i] += 1;
        }

        return path;
    }

//    public static void main(String[] args) {
//        String filePath = "C:/Users/USUARIO/Downloads/rutas.csv";
//        int[][] matrix = CSVReader.createCostMatrix(filePath);
//        CSVReader.printMatrix(matrix);
//
//        int startVertex = 1;
//        int endVertex = 10;
//
//        try {
//            int cost = getMinimumCost(matrix, startVertex, endVertex);
//            int[] path = getPath(matrix, startVertex, endVertex);
//
//            System.out.println("Costo mínimo: " + cost);
//            System.out.println("Camino: " + Arrays.toString(path));
//        } catch (IllegalArgumentException e) {
//            System.err.println(e.getMessage());
//        }
//    }
}
