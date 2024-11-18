public void main() {
    int risultato = moltiplicazione(3, 7);
    System.out.println("Risultato moltiplicazione: " + risultato);

    String stringa = concatenazione("Ciao ", 32);
    System.out.println(stringa);

    String stringhe = inserimentoUtente();
    System.out.println(stringhe);

    double risultatoPerimetro = perimetroRettangolo();
    System.out.println(risultatoPerimetro);

    int parioDispari = pariDispari();
    System.out.println(parioDispari);

    double areaTriangolo = perimetroTriangolo();
    System.out.println(areaTriangolo);
}

//Esercizio 1 - A

int moltiplicazione (int n1, int n2) {
    return n1*n2;
}

// Esercizio 1 - B

String concatenazione (String a, int b) {
    return a + b;
}

// Esercizio 1 - C



// Esercizio 2
String inserimentoUtente () {
    System.out.println("Inserire tre stringhe: ");
    Scanner scanner = new Scanner(System.in);
    String s1 = scanner.nextLine();
    String s2 = scanner.nextLine();
    String s3 = scanner.nextLine();
    return s1 + " " + s2 + " " + s3;
}

//Esercizio 3 - A
double perimetroRettangolo () {
    System.out.println("Inserire i lati del rettangolo: ");
    Scanner scanner = new Scanner(System.in);
    double n1 = scanner.nextDouble();
    double n2 = scanner.nextDouble();
    return 2*n1 + 2*n2;
}

//Esercizio 3 - B
int pariDispari () {
    System.out.println("Inserire un numero: ");
    Scanner scanner = new Scanner(System.in);
    int n1 = scanner.nextInt();
    if ( n1 % 2 == 0) {
        return 0;
    } else {
        return 1;
    }
}

// Esercizio 3 - C
double perimetroTriangolo () {
    System.out.println("Inserire i lati del triangolo: ");
    Scanner scanner = new Scanner(System.in);
    double n1 = scanner.nextDouble();
    double n2 = scanner.nextDouble();
    double n3 = scanner.nextDouble();
    double p = n1+n2+n3 / 2;
    return Math.sqrt(p * (p - n1) * (p - n2) * (p - n3));
}

