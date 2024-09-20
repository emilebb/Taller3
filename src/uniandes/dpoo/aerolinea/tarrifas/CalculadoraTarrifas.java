package uniandes.dpoo.aerolinea.tarrifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarrifas {

    public static double INPUESTO = 0.28;

    public int calcularTrrifa(Vuelo vuelo, Cliente cliente) {
        return 0;
    }

    protected abstract int calcularCostoBasse(Vuelo vuelo, Cliente cliente);

    protected abstract double calcularPorcentajeDescuento(Cliente cliente);

    protected int calcularDistaciaVuelo(Ruta ruta) {
        return 0;
    }

    protected int calcularValorInpuestos(int costoBasse) {
        return 0;
    }
}
