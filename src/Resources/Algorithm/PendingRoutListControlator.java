package Resources.Algorithm;

import Main.App;
import Utilities.Others.Day;
import java.util.ArrayList;


public class PendingRoutListControlator{
    private static ArrayList<Route> dataList = new ArrayList<>();
    public static int routesCount;

    public static ArrayList<Route> getDataList() {
        return dataList;
    }

    public static void addItem(Route item) {
        dataList.add(item);
        routesCount++;
    }

    public static void removeItem(Route item) {
        dataList.remove(item);
    }
    
    public static int size(){
        return dataList.size();
    }
    
    private static String showByDay(Day day) {
        String returnable = "";
        for(Route route : dataList) {
            if(route.getDay().compareTo(day) == 0) {
                returnable += route.toString() + "\n";
            }
        }
        return returnable;
    }
    
    public static String sortRoutesByDays(){
        String returnable = "";
        for(int i=1; i < 6; i++) {
            returnable += DayAsignator.createDayByIndex(i) + "\n";
            returnable += showByDay(DayAsignator.createDayByIndex(i)) + "\n\n";
        }
        return returnable;
    }
    
    private static String showPendingRoute(Day day) {
        String returnable = "";
        for(Route route : dataList) {
            if(route.getDay().compareTo(day) == 0) {
                returnable += route.showRoute() + "\n";
            }
        }
        return returnable;
    }
    
    public static String showPendingRoutesByDay() {
        String returnable = "";
        for(int i = 1; i< 6; i++) {
            returnable += DayAsignator.createDayByIndex(i) + "\n";
            returnable += showPendingRoute(DayAsignator.createDayByIndex(i)) + "\n\n";
        }
        return returnable;
    }
    
    public static Route findRoute(int origen, int destiny, Day day) {
        Route returnable = null;
        for(Route route : dataList) {
            if(route.compareRoute(origen, destiny, day)){
                returnable = route;
            }
        }
        return returnable;
    }
    
    private static void editAdjacencyMatrix() {
        for(int[] row : App.adjacencyMatrix) {
            for(int val : row) {
                val = 0;
            }
        }
        for(Route route : dataList) {
            App.adjacencyMatrix[route.getOrigen()-1][route.getDestiny()-1] = 1;
        }
    }
    
    public static String showMatrix() {
        editAdjacencyMatrix();
        String chain = "";
        for (int[] row : App.adjacencyMatrix) {
            for (int val : row) {
                if (val == Integer.MAX_VALUE) {
                    chain += " 0 ";
                } else {
                    chain += " " + val + " ";
                }
            }
            chain += "\n";
        }
        return chain;
    }
}
