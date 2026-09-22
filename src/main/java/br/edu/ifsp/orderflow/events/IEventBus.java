package br.edu.ifsp.orderflow.events;

public interface IEventBus {
    /**
     * Um IEventBus (ou barramento de evento) funciona como um quadro de avisos,
     * onde serviços publicam eventos e os handlers registrados são avisados
     *
     */
    <E extends IDomainEvent> void publish(E event);

    <E extends IDomainEvent> void register(IEventHandler<E> handler);
}