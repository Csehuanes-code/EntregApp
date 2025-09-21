package Resources.Algorithm;

import Utilities.Others.Day;

public class DayAsignator {
    public static Day createDayByIndex(int index) {
        Day returnable = Day.None;
        switch(index) {
            case 0 -> returnable = Day.None;
            case 1 -> returnable = Day.Monday;
            case 2 -> returnable = Day.Tuesday;
            case 3 -> returnable = Day.Wednesday;
            case 4 -> returnable = Day.Thursday;
            case 5 -> returnable = Day.Friday;
        };
        return returnable;
    }
}
