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
import SQL.ConnectMySQL;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author TUNGDUONG
 */
public class BarChartMain extends JPanel {

    private String title, xName, yName;
    final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
    private ArrayList<Comparable> keys = new ArrayList<>();
    private ArrayList<Integer> values = new ArrayList<>();
    private ArrayList<Integer> cols = new ArrayList<>();

    public BarChartMain() {
    }

    public BarChartMain(ArrayList<Integer> values, ArrayList<Comparable> key, ArrayList<Integer> cols, String title, String xName, String yName) {
        super(new GridLayout());
        this.title = title;
        this.xName = xName;
        this.yName = yName;
        this.keys = key;
        this.values = values;
        this.cols = cols;
        ChartPanel chartPanel = new ChartPanel(createBarChart(dataset));
        add(chartPanel);
    }

    private CategoryDataset createDataset(DefaultCategoryDataset dataset) {
        for (int j = 0; j < keys.size(); j++) {
            for (int z = 0; z < values.size() / keys.size(); z++) {
                for (int i = 0; i < values.size(); i++) {
                    dataset.setValue(values.get(i), keys.get(j), cols.get(z));
                }
            }
        }
        return dataset;
    }

    public JFreeChart createBarChart(DefaultCategoryDataset dataset) {
        JFreeChart barChart = ChartFactory.createBarChart(
                title.toUpperCase(),
                xName, yName,
                createDataset(dataset),
                PlotOrientation.VERTICAL, true, true, false);
        return barChart;
    }

    

    public static void main(String[] args) {
   
    }

}
