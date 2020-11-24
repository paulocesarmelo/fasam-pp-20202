/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator_demo;

/**
 *
 * @author paulocesarmelo
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
