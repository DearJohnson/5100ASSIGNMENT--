/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package assignment8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class MyJson {

    private static ArrayList<Vehicle> readAndGetVehicles(File file) throws IOException {
        FileReader reader = new FileReader(file);
        Scanner sc = new Scanner(reader);
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        String[] record;

        sc.nextLine(); 
        while (sc.hasNextLine()) {
            record = sc.nextLine().split("~");
            Vehicle vehicle = new Vehicle(record);
            vehicles.add(vehicle);
        }
        reader.close();

        return vehicles;
    }

    public static String getJsonString(ArrayList<Vehicle> vehicles) {
        String json = "{\n\"" + vehicles.get(0).webId + "\" : [\n";
        for (Vehicle vehicle : vehicles) {
            json += "{\n";
            json += "\"id\" : \"" + vehicle.id + "\"\n";
            json += "\"category\" : \"" + vehicle.category + "\"\n";
            json += "\"year\" : \"" + vehicle.year + "\"\n";
            json += "\"make\" : \"" + vehicle.make + "\"\n";
            json += "\"model\" : \"" + vehicle.model + "\"\n";
            json += "\"trim\" : \"" + vehicle.trim + "\"\n";
            json += "\"type\" : \"" + vehicle.type + "\"\n";
            json += "\"price\" : \"" + vehicle.price + "\"\n";
            json += "\"photo\" : \"" + vehicle.photo + "\"\n";
            json += "},\n";
        }
        json += "]\n}";

        return json;
    }

    public static void writeToFile(String inputToWrite, String filePath) throws IOException{
        File f = new File (filePath + "\\Question3_output.txt");
	f.createNewFile();
	FileWriter fw = new FileWriter(f);
	BufferedWriter bf = new BufferedWriter(fw);
	bf.write(inputToWrite);
	bf.close();
    }
    
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Program Files (x86)\\NetBeansProjects\\Assignment8\\src\\assignment8\\Question3_camino.txt");
        ArrayList<Vehicle> vehicles = readAndGetVehicles(file);
        String s = getJsonString(vehicles);
        writeToFile(s, file.getParent());
    }
}
