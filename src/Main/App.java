package Main;

import Resources.Algorithm.CompletedRouteListControlator;
import Resources.Algorithm.Route;
import Resources.Algorithm.PendingRoutListControlator;
import Resources.Reader.CSVReader;
import Utilities.View.CompletedRoutesFrame;
import Utilities.View.DoRouteFrame;
import Utilities.View.GraphicsFrame;
import Utilities.View.PendingRoutesList;
import Utilities.View.ReportFrame;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class App {
    private JFrame frame;
    private boolean fileLoaded = false;
    private String filePath;
    private int [][] costMatrix;
    public static int [][] adjacencyMatrix;
    private ImageIcon errorIcon = new ImageIcon(getClass().getResource("/Utilities/Pictures/error.png"));
    
    public App(JFrame frame) {
        this.frame = frame;
    }
    
    public void loadFile(){
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter(
            "Archivos de Excel (*.csv)", "csv")); 
        if (fileChooser.showOpenDialog(frame) == JFileChooser.APPROVE_OPTION) {
            fileLoaded = true;
            filePath = fileChooser.getSelectedFile().getPath();
            costMatrix = CSVReader.createCostMatrix(filePath);
            adjacencyMatrix = CSVReader.createAdjacencyMatrix(filePath);
        }
    }
    
    public void doRoute() {
        if(PendingRoutListControlator.size()!=0) {
            DoRouteFrame.getInstance();
            DoRouteFrame.getInstance().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, 
                    "No tienes rutas pendientes por realizar", 
                    "Error", JOptionPane.INFORMATION_MESSAGE,
                    errorIcon);
        }
    }
    
    public void showPendingRoutes() {
        if(PendingRoutListControlator.size() != 0) {
            PendingRoutesList.getInstance();
            PendingRoutesList.getInstance().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(null, 
                    "No tienes rutas pendientes por realizar", 
                    "Error de archivo", JOptionPane.INFORMATION_MESSAGE,
                    errorIcon);
        }
    }
    
    public void showCompletedRoutes() {
        if(CompletedRouteListControlator.size() !=0) {
            CompletedRoutesFrame.getInstance();
            CompletedRoutesFrame.getInstance().setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, 
                    "No has realizado ninguna ruta", 
                    "Error", JOptionPane.INFORMATION_MESSAGE,
                    errorIcon);
        }
    }
    
    public void weeklyPlan(){
        if(PendingRoutListControlator.size() !=0) {
            PendingRoutesList.getInstance();
            PendingRoutesList.getInstance().setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, 
                    "No has cargado las rutas de entrega o ya completastes todas las rutas pendientes", 
                    "Error de archivo", JOptionPane.INFORMATION_MESSAGE,
                    errorIcon);
        }
    }
    
    public void showGraphics() {
        if(PendingRoutListControlator.size() != 0) {
            GraphicsFrame.getInstance();
            GraphicsFrame.getInstance().setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, 
                    "No has cargado las rutas de entrega o ya completastes todas las rutas pendientes", 
                    "Error de archivo", JOptionPane.INFORMATION_MESSAGE,
                    errorIcon);
        }
    }
    
    
    public void report() {
        if(CompletedRouteListControlator.size()!=0){
            ReportFrame.getInstance();
            ReportFrame.getInstance().setVisible(true);
        }
        else {
            JOptionPane.showMessageDialog(null, 
                    "No has realizado ninguna ruta", 
                    "Error de archivo", JOptionPane.INFORMATION_MESSAGE,
                    errorIcon);
        }
    }
    
    public void fillPendingRouteList(ArrayList<Route> pendingRoutes) {
        if(PendingRoutListControlator.size()!=0){
            for(Route route : pendingRoutes) {
                PendingRoutListControlator.addItem(route);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, 
                    "No has cargado las rutas de entrega", 
                    "Error de archivo", JOptionPane.INFORMATION_MESSAGE,
                    errorIcon);
        }
    }
    
    
    
    
    //GETTERS
    public boolean getFileLoaded() {
        return fileLoaded;
    }
    
    public ArrayList<Route> getCompletedRuths() {
        return CompletedRouteListControlator.getDataList();
    }

    public ArrayList<Route> getPendingRoutes() {
        return PendingRoutListControlator.getDataList();
    }

    public int[][] getCostMatrix() {
        return costMatrix;
    }
    
}
