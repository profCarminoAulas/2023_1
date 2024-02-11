public class ExemploDeParalelismo {
    public static void main(String[] args){
        System.out.println("inicio do processamento"); 
        int totalDeThreasds = 4; 
        int totais = 0;
        Thread[] threads = new Thread[totalDeThreasds];
        System.out.println("Populando o vetor");
        for( int i = 0; i < totalDeThreasds; i++){
            final int numeroDaThread =i;
            
            threads[i] = new Thread(() -> {
                try{
                    Thread.sleep(2000 * (4 - numeroDaThread));
                } catch ( InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread finalizada " + numeroDaThread);
            });
        }
        System.out.println("Vetor populado");
        System.out.println("Iniciando as Threads");
        for(Thread thread: threads){
            thread.start();
        }
        System.out.println("Threads já iniciadas");
        for( Thread thread: threads){
            try {
                thread.join();    
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Threads finalizadas");
    }
}
