package estabelecimento;

import equipamentos.copiadora.Copiadora;
import equipamentos.digitalizadora.Digitalizadora;
import equipamentos.digitalizadora.Scanner;
import equipamentos.impressora.Deskjet;
import equipamentos.impressora.Impressora;
import equipamentos.impressora.Laserjet;
import equipamentos.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner scanner = new Scanner();

        Deskjet deskjet = new Deskjet();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitalizar();
        copiadora.copiar();

    }
}
