package teste;

import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph extends JFrame {

    public Graph() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Gráfico de Barras");
        setSize(950, 700);
        setLocationRelativeTo(null);
        criarGrafico();
        setVisible(true);
    }

    public void criarGrafico() {
        DefaultCategoryDataset barra = new DefaultCategoryDataset();
        barra.setValue(1400, "China", "");
        barra.setValue(1200, "índia", "");
        barra.setValue(320, "EUA", "");
        barra.setValue(210, "Brasil", "");
        barra.setValue(115, "Japão", "");
        barra.setValue(30, "Austrália", "");
        barra.setValue(18, "Portugal", ""); 

        JFreeChart grafico = ChartFactory.createBarChart3D("A","B","C",barra,PlotOrientation.VERTICAL,true,true,false);
        ChartPanel painel = new ChartPanel(grafico);
        add(painel);
    }

    public static void main(String[] args) {
        new Graph();
    }
}
