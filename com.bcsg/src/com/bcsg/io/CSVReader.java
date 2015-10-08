/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcsg.io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dominic
 */
public class CSVReader {
    private String delimiter;
    
    public CSVReader()
    {
        this(",");
    }
    
    public CSVReader(String delimiter)
    {
        this.delimiter = delimiter;
    }
    
    public String[][] Read(String path) throws FileNotFoundException, IOException
    {
        BufferedReader br = null;
	String line = "";
        int columnNo = 0;
	List<String[]> rows = new ArrayList<String[]>();

	try {
		br = new BufferedReader(new FileReader(path));
		while ((line = br.readLine()) != null) {
		        if (line == null || "".equals(line))
                        {
                            continue;
                        }
                        
			String[] columns = line.split(this.delimiter);
                        columnNo = columns.length;
                        
                        if (columnNo == 0)
                        {
                            continue;
                        }
                        
                        rows.add(columns);
		}
	} finally {
		if (br != null) {
			br.close();
		}
	}
        
        return (String[][]) rows.toArray(new String[rows.size()][columnNo]);
    }
}
