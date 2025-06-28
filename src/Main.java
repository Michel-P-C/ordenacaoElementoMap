import java.time.LocalDate;
import java.time.Month;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();
        //localDate.of (coloca a data) e por fora coloca o evento.
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JULY, 15), "Evento 01", "Atração 01");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 7, 9), "Evento 02", "Atração 02");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JANUARY, 10), "Evento 03", "Atração 03");
        //agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JUNE, 2), "Evento 04", "Atração 04");
        //agendaEventos.adicionarEvento(LocalDate.of(2025, Month.JUNE, 3), "Evento 05", "Atração 05");
        agendaEventos.adicionarEvento(LocalDate.of(2026, Month.SEPTEMBER, 20), "Evento 06", "Atração 06");

        agendaEventos.exibirAgenda();

        agendaEventos.obterProximoEvento();
    }
}