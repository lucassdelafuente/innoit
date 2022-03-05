package utils;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class SystemDate {

    private String dayOfWeekString;
    Calendar date = new GregorianCalendar();

    //Obtengo los nombres de los días de la semana para poder comparar.
    public String dayOfWeek(){
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);

        switch (dayOfWeek) {
            case 1:
                dayOfWeekString = "Domingo";
                break;
            case 2:
                dayOfWeekString = "Lunes";
                break;
            case 3:
                dayOfWeekString = "Martes";
                break;
            case 4:
                dayOfWeekString = "Miercoles";
                break;
            case 5:
                dayOfWeekString = "Jueves";
                break;
            case 6:
                dayOfWeekString = "Viernes";
                break;
            case 7:
                dayOfWeekString = "Sabado";
                break;
        }
        return dayOfWeekString;
    }

    public int getDayOfMonth(){
        return date.get(Calendar.DAY_OF_MONTH);
    }

    //Obtengo los nombres de los meses.
    public String getMonth(){
        String[] monthName = {"ENERO", "FEBRERO", "MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO",
                "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

        Calendar cal = Calendar.getInstance();
        return monthName[cal.get(Calendar.MONTH)];
    }

}
