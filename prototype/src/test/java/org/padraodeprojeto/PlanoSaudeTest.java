package org.padraodeprojeto;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PlanoSaudeTest {

    @Test
    void testCloneIndividual() throws CloneNotSupportedException {
        PlanoSaude planoOriginal = new PlanoSaude("Individual", "Cobertura Completa", 350.00);

        PlanoSaude planoClonado = planoOriginal.clone();
        planoClonado.setValorMensal(300.00); // Personalizando o valor

        assertEquals("PlanoSaude{tipoPlano='Individual', cobertura='Cobertura Completa', valorMensal=350.0}", planoOriginal.toString());
        assertEquals("PlanoSaude{tipoPlano='Individual', cobertura='Cobertura Completa', valorMensal=300.0}", planoClonado.toString());
    }

    @Test
    void testCloneFamiliar() throws CloneNotSupportedException {
        PlanoSaude planoOriginal = new PlanoSaude("Familiar", "Cobertura Básica", 500.00);

        PlanoSaude planoClonado = planoOriginal.clone();
        planoClonado.setCobertura("Cobertura Plus");
        planoClonado.setValorMensal(550.00);

        assertEquals("PlanoSaude{tipoPlano='Familiar', cobertura='Cobertura Básica', valorMensal=500.0}", planoOriginal.toString());
        assertEquals("PlanoSaude{tipoPlano='Familiar', cobertura='Cobertura Plus', valorMensal=550.0}", planoClonado.toString());
    }

    @Test
    void testCloneEmpresarial() throws CloneNotSupportedException {
        PlanoSaude planoOriginal = new PlanoSaude("Empresarial", "Cobertura Premium", 1500.00);

        PlanoSaude planoClonado = planoOriginal.clone();
        planoClonado.setTipoPlano("Empresarial Personalizado");
        planoClonado.setValorMensal(1400.00);

        assertEquals("PlanoSaude{tipoPlano='Empresarial', cobertura='Cobertura Premium', valorMensal=1500.0}", planoOriginal.toString());
        assertEquals("PlanoSaude{tipoPlano='Empresarial Personalizado', cobertura='Cobertura Premium', valorMensal=1400.0}", planoClonado.toString());
    }
}