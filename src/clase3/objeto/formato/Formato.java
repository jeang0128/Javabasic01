package clase3.objeto.formato;

import java.text.NumberFormat;
import java.util.Locale;

import java.util.Calendar;
import java.util.GregorianCalendar;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Formato {

    public static void main(String[] args) {
        // Formato.numberFormat();
        // Formato.monedaFormat();
        //Formato.fechaFormat();
        // Formato.dateFormat();
        //Formato.simpleDateFormat();
        Formato.compararFechas();
    }

    public static void compararFechas() {
        Calendar fechaone = new GregorianCalendar(2011, 12, 1);
        Date d1 = fechaone.getTime();
        Calendar fecha2 = new GregorianCalendar(2011, 7, 1);
        Date d2 = fecha2.getTime();
        if (d1.after(d2)) {
            System.out.println("fechaUno es después que fechaDos");
        }
        if (d1.before(d2)) {
            System.out.println("fechaUno es antes que fechaDos");
        }
    }

    public static void simpleDateFormat() {
        DateFormat df = new SimpleDateFormat("E  / d  / MMMM");

        Date now = new Date();
        System.out.println(df.format(now));
    }

    public static void dateFormat() {


        Date now = new Date();
        System.out.println(now.getTime());

        DateFormat df = DateFormat.getDateInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.SHORT);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.MEDIUM);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.LONG);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.SHORT, Locale.US);

        // SimpleDateFormat df5 = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss Z");
        //DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, Locale.US);

        System.out.println(df1.format(now));
        System.out.println(df2.format(now));
        System.out.println(df3.format(now));
        System.out.println(df4.format(now));
        System.out.println(df5.format(now));
        System.out.println(df6.format(now));

        String s = df.format(now);
        String s1 = df1.format(now);
        String s2 = df2.format(now);
        String s3 = df3.format(now);
        String s4 = df4.format(now);
        String s5 = df5.format(now);
        System.out.println("(Default) Hoy es " + s);
        System.out.println("(SHORT) Hoy es " + s1);
        System.out.println("(MEDIUM) Hoy es " + s2);
        System.out.println("(LONG) Hoy es " + s3);
        System.out.println("(FULL) Hoy es " + s4);
        System.out.println("(CUSTOM) Hoy es " + s5);
    }

    public static void fechaFormat() {

// Crear una fecha
//Calendar ahora = new GregorianCalendar(2007,2,2);
        GregorianCalendar ahora = new GregorianCalendar();
        //Calendar ahora = new GregorianCalendar(2000, 11, 30);

        System.out.println("Fecha : " + ahora.getTime());
        System.out.println("Año: " + ahora.get(Calendar.YEAR));
        System.out.println("Mes: " + ahora.get(Calendar.MONTH));
        System.out.println("Día del mes: " + ahora.get(Calendar.DAY_OF_MONTH));
//
        System.out.println("Hora: " + ahora.get(Calendar.HOUR));
        System.out.println("Minuto: " + ahora.get(Calendar.MINUTE));
        System.out.println("Segundo: " + ahora.get(Calendar.SECOND));
        System.out.println("Milisegundo: " + ahora.get(Calendar.MILLISECOND));
//
        System.out.println("Primer día de la semana : " + ahora.getFirstDayOfWeek());
        System.out.println("Semana del mes: "
                + ahora.get(Calendar.WEEK_OF_MONTH));
        System.out.println("Semana del año: "
                + ahora.get(Calendar.WEEK_OF_YEAR));
        System.out.println("Día del año: " + ahora.get(Calendar.DAY_OF_YEAR));

    }

    public static void monedaFormat() {
        // Formato de moneda
        NumberFormat nfe = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        nfe.setGroupingUsed(false);
        NumberFormat nfd = NumberFormat.getCurrencyInstance(Locale.US);
        nfd.setGroupingUsed(false);
        Locale lp = new Locale("es", "PE");
        NumberFormat nfp = NumberFormat.getCurrencyInstance(lp);
        nfp.setGroupingUsed(false);
        System.out.println("Moneda Euro :" + nfe.format(150));
        System.out.println("Moneda Dolar :" + nfd.format(150));
        System.out.println("Moneda Soles :" + nfp.format(150));
    }

    public static void numberFormat() {

        NumberFormat nf = NumberFormat.getInstance(Locale.US);
// Agrupar 
        nf.setGroupingUsed(true);
        System.out.println(nf.format(10000000.0045451));
// No agrupar
        nf.setGroupingUsed(false);
        System.out.println(nf.format(10000000.0045451));
        System.out.println("Con 3 enteros mínimo");
        nf.setMinimumIntegerDigits(3);
        System.out.println(nf.format(12));
        System.out.println("Con 5 enteros máximo");
        nf.setMaximumIntegerDigits(5);
        System.out.println(nf.format(123456));
        System.out.println("Con 4 enteros máximo en los decimales");
        nf.setMaximumFractionDigits(4);
        System.out.println(nf.format(123.981454));
        System.out.println("Con 2 enteros mínimo en los decimales");
        nf.setMinimumFractionDigits(2);
        System.out.println(nf.format(45.2));
    }
}
