package uniandes.dpoo.aerolinea.modelo;

/**
 * Esta clase tiene la información de una ruta entre dos aeropuertos que cubre
 * una aerolínea.
 */
public class Ruta {
    // TODO completar

    private String horaDesalida;
    private String horaDellegada;
    private String codigoRuta;

    private Aeropuerto aeropuertoOrigen;
    private Aeropuerto aeropuertoDestino;

    // Conductor
    public Ruta(Aeropuerto origen, Aeropuerto destino, String horaSalida, String horaLlegada, String codigoRuta) {
        this.aeropuertoOrigen = origen;
        this.aeropuertoDestino = destino;
        this.horaDesalida = horaSalida;
        this.horaDellegada = horaLlegada;
        this.codigoRuta = codigoRuta;
    }

    public Aeropuerto getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }

    public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }

    public Aeropuerto getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }

    public String gethoraDesalida() {
        return horaDesalida;
    }

    public void sethoraDesalida(String hora) {
        this.horaDesalida = hora;
    }

    public String getHoraDellegada() {
        return horaDellegada;
    }

    public void setHoraDellegada(String horaDellegada) {
        this.horaDellegada = horaDellegada;
    }

    public String getCodigoRuta() {
        return codigoRuta;
    }

    public void setCodigoRuta(String codigoRuta) {
        this.codigoRuta = codigoRuta;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna los minutos.
     * 
     * Por ejemplo, para la cadena '715' retorna 15.
     * 
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan
     *                     los dos últimos caracteres
     * @return Una cantidad de minutos entre 0 y 59
     */
    public static int getMinutos(String horaCompleta) {
        int minutos = Integer.parseInt(horaCompleta) % 100;
        return minutos;
    }

    /**
     * Dada una cadena con una hora y minutos, retorna las horas.
     * 
     * Por ejemplo, para la cadena '715' retorna 7.
     * 
     * @param horaCompleta Una cadena con una hora, donde los minutos siempre ocupan
     *                     los dos últimos caracteres
     * @return Una cantidad de horas entre 0 y 23
     */
    public static int getHoras(String horaCompleta) {
        int horas = Integer.parseInt(horaCompleta) / 100;
        return horas;
    }

}