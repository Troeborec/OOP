package transport;

import java.util.Queue;

public class ServiceStation {
    private Queue<Transport> queue;

    public ServiceStation(Queue<Transport> queue) {
        this.queue = queue;
    }

    public void getAvtoInQueue() {
    }

    public void doTehosmotrAvto() {
    }


    public void addToQueue(Transport transport) {
        if ( transport.needDiagnostic()) {
            queue.offer(transport);
            System.out.println(transport.getBrand() + " в очереди на техобслуживание");
        } else {
            System.out.println("Диагностики не подлежит!");
        }
    }

    public void performTechnicalInspection() {
        System.out.println(queue.poll().getBrand() + " техосмотр прошел");
    }
}
