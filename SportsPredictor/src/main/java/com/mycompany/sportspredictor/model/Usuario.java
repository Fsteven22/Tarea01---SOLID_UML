public class Pronostico {
    private String estado;
    private int puntosGanados;
    private EventoDeportivo eventoObjetivo;
    private ITipoPronostico tipoPronostico;

    public Pronostico(EventoDeportivo eventoObjetivo, ITipoPronostico tipoPronostico) {
        this.eventoObjetivo = eventoObjetivo;
        this.tipoPronostico = tipoPronostico;
        this.estado = "pendiente";
        this.puntosGanados = 0;
    }
