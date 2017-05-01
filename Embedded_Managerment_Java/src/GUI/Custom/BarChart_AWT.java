/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Custom;

import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;

/**
 *
 * @author chuna
 */
public class BarChart_AWT extends JPanel {

    private String chartTitle;
    private String xName;
    private String yName;
    private PlotOrientation orientation;
    private CategoryDataset dataset;

    public BarChart_AWT(String chartTitle, String xName, String yName, PlotOrientation orientation, CategoryDataset dataset) {
        this.chartTitle = chartTitle;
        this.xName = xName;
        this.yName = yName;
        this.orientation = orientation;
        this.dataset = dataset;
        initComponent();
    }

    public void initComponent() {
        JFreeChart barChart = ChartFactory.createBarChart(
                chartTitle,
                xName,
                yName,
                dataset,
                orientation,
                true, true, false);
        ChartPanel chartPanel = new ChartPanel(barChart);
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        add(chartPanel);
    }

}
