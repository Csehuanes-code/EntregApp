package Resources.Algorithm;

import Utilities.Others.Day;

public class Route {
    private int origen;
    private int destiny;
    private int cost;
    private Day day;
    private int[] routePath;

    public Route(int origen, int destiny, int cost, Day day, int[] routePath) {
        this.origen = origen;
        this.destiny = destiny;
        this.cost = cost;
        this.day = day;
        this.routePath = routePath;
    }
    
    
    public boolean compareRoute(int origen, int destiny, Day day) {
        return (this.origen == origen && this.destiny == destiny && this.day.equals(day));
    }
    
    private String showRoutePath() {
        String returnable = "";
        for (int i = 0; i < routePath.length; i++) {
            returnable += routePath[i]; // Concatenar el valor en routePath[i]
            if (i < routePath.length - 1) { // Agregar coma solo si no es el último elemento
                returnable += ", ";
            }
        }
        return returnable;
}

    //GETTERS
    public int getOrigen() {
        return origen;
    }

    public Day getDay() {
        return day;
    }

    public int getDestiny() {
        return destiny;
    }

    public int getCost() {
        return cost;
    }

    public int[] getRoutePath() {
        return routePath;
    }
    
    //TOSTRING
    @Override
    public String toString() {
        return "Origen: "+ origen +
                "; Destino: " + destiny + 
                "; Costo: " + cost + 
                "; Dia: "+ day + 
                "; Ruta: [" + showRoutePath() + "]";
    }
    
    public String showRoute() {
        return "Origen: " + origen + "  |  Destino: " + destiny;
    }
}


