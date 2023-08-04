package Q35;

/* Escreva uma classe que contenha métodos estáticos para retornar o maior de dois, três,
quatro e cinco valores, considerando que os argumentos e o retorno dos métodos podem
ser dos tipos int e double. Escreva um aplicativo de teste que demonstre as capacidades
da classe criada. */

public class Maior {
    public int i1;
    public int i2;
    public int i3;
    public int i4;
    public int i5;
    public double d1;
    public double d2;
    public double d3;
    public double d4;
    public double d5;

    public Maior() {
    }

    public static int calculaMaior (int i1, int i2) {
        if (i1 > i2) {
            return i1;
        } else {
            return i2;
        }
    }

    public static int calculaMaior (int i1, int i2, int i3) {
        if (i1 > i2 && i1 > i3) {
            return i1;
        } else if (i2 > i3) {
            return i2;
        } else {
            return i3;
        }
    }

    public static int calculaMaior (int i1, int i2, int i3, int i4) {
        if (i1 > i2 && i1 > i3 && i1 > i4) {
            return i1;
        } else if (i2 > i3 && i2 > i4) {
            return i2;
        } else if (i3 > i4) {
            return i3;
        } else {
            return i4;
        }
    }
    
    public static int calculaMaior (int i1, int i2, int i3, int i4, int i5) {
        if (i1 > i2 && i1 > i3 && i1 > i4 && i1 > i5) {
            return i1;
        } else if (i2 > i3 && i2 > i4 && i2 > i5) {
            return i2;
        } else if (i3 > i4 && i3 > i5) {
            return i3;
        } else if (i4 > i5) {
            return i4;
        } else {
            return i5;
        }
    }

    public static double calculaMaior (double d1, double d2) {
        if (d1 > d2) {
            return d1;
        } else {
            return d2;
        }
    }

    public static double calculaMaior (double d1, double d2, double d3) {
        if (d1 > d2 && d1 > d3) {
            return d1;
        } else if (d2 > d3) {
            return d2;
        } else {
            return d3;
        }
    }

    public static double calculaMaior (double d1, double d2, double d3, double d4) {
        if (d1 > d2 && d1 > d3 && d1 > d4) {
            return d1;
        } else if (d2 > d3 && d2 > d4) {
            return d2;
        } else if (d3 > d4) {
            return d3;
        } else {
            return d4;
        }
    }
    
    public static double calculaMaior (double d1, double d2, double d3, double d4, double d5) {
        if (d1 > d2 && d1 > d3 && d1 > d4 && d1 > d5) {
            return d1;
        } else if (d2 > d3 && d2 > d4 && d2 > d5) {
            return d2;
        } else if (d3 > d4 && d3 > d5) {
            return d3;
        } else if (d4 > d5) {
            return d4;
        } else {
            return d5;
        }
    }
}
