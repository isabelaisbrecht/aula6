public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

    }

}
public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5];

    }

}

public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5];

        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;

    }

}
public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5];

        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;

        int idade4 = idades[3];

        System.out.println(idade4);

    }

}
public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5];

        idades[0] = 29;
        idades[1] = 39;
        idades[2] = 49;
        idades[3] = 59;
        idades[4] = 69;

        int idade4 = idades[3];

        System.out.println(idade4);
        System.out.println(idades.length);

    }

}
public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5];

    }

}
public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5];

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

    }

}
public class TesteArrayDePrimitivos {

    public static void main(String[] args) {

        int[] idades = new int[5];

        for (int i = 0; i < idades.length; i++) {
            idades[i] = i * i;
        }

        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }

    }

}
public class TesteArrayReferencias {

    public static void main(String[] args) {

    }

}
public class TesteArrayReferencias {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5];

    }

}
public class TesteArrayReferencias {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        ContaCorrente cc2 = new ContaCorrente(22, 22);

        contas[0] = cc1;
        contas[1] = cc2;

    }

}
public class TesteArrayReferencias {

    public static void main(String[] args) {

        ContaCorrente[] contas = new ContaCorrente[5];

        ContaCorrente cc1 = new ContaCorrente(22, 11);
        ContaCorrente cc2 = new ContaCorrente(22, 22);

        contas[0] = cc1;
        contas[1] = cc2;

        System.out.println(contas[0].getNumero());

    }

}
