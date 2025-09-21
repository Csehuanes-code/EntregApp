package Resources.Algorithm;

import Utilities.Others.Day;
import java.util.ArrayList;


public class CompletedRouteListControlator {
    private static ArrayList<Route> dataList = new ArrayList<>();
    public static int totalCost = 0;

    public static ArrayList<Route> getDataList() {
        return dataList;
    }

    public static void addItem(Route item) {
        dataList.add(item);
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
    
    public static String SortRoutesByDays(){
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
    
    public static int calculateTotalCost() {
        if(!dataList.isEmpty()) {
            int totalCost = 0;
            for(Route route : dataList) {
                totalCost += route.getCost();
            }
            return totalCost;
        }
        return 0;
    }
}
