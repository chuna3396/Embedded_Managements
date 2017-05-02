/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BarChart;

/**
 *
 * @author chuna
 */
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author TUNGDUONG
 */
public class PieChartMain extends JPanel {

    private String title;
    private DefaultPieDataset dataset = new DefaultPieDataset();
    private ArrayList<Comparable> key = new ArrayList<>();
    private ArrayList<Integer> list = new ArrayList<>();

    public PieChartMain(ArrayList<Comparable> key, ArrayList<Integer> list, String title) {
        super(new GridLayout());
        this.title = title;
        this.key = key;
        this.list = list;
        ChartPanel chartPanel = new ChartPanel(createPieChart(createDataset(dataset)));
        add(chartPanel);
    }

    private PieDataset createDataset(DefaultPieDataset dataset) {
        for (int i = 0; i < key.size(); i++) {
            dataset.setValue(key.get(i), list.get(i));
        }
        return dataset;
    }

    private JFreeChart createPieChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                title.toUpperCase(),
                dataset, true, true, true);
        return chart;
    }

    public static void main(String[] args) {
        ArrayList<Comparable> key = new ArrayList<>();
        ArrayList<Integer> list = new ArrayList<>();
        key.add("Cây lương thực");
        key.add("Cây công nghiệp");
        key.add("Cây thực phẩm, cây ăn quả, cây khác");
        list.add(1000);
        list.add(2000);
        list.add(1500);
        String title = "Biểu đồ cây trồng ở Việt Nam";
        PieChartMain main = new PieChartMain(key, list, title);
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout());
        frame.add(main);
        frame.setSize(825, 550);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
