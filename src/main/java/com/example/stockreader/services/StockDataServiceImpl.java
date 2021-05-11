package com.example.stockreader.services;

import com.example.stockreader.models.StockData;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;


@Service
public class StockDataServiceImpl implements StockDataService {

    private List<StockData> allStockData = new ArrayList<>();

    @Override
    public List<StockData> getAllStockData() {
        return allStockData;
    }


    @PostConstruct
    @Override
    public void readStockData() {
        {
            try (Reader in = new FileReader("table.csv")) {
//                Reader in = new FileReader("table.csv");
                Iterable<CSVRecord> records = CSVFormat.DEFAULT.withFirstRecordAsHeader().parse(in);
                for (
                        CSVRecord record : records) {
                    StockData stockData = new StockData();
                    stockData.setOpen(Double.parseDouble(record.get("Open")));
                    stockData.setHigh(Double.parseDouble(record.get("High")));
                    stockData.setLow(Double.parseDouble(record.get("Low")));
                    stockData.setClose(Double.parseDouble(record.get("Close")));
                    stockData.setVolume(Double.parseDouble(record.get("Volume")));
                    stockData.setAdjClose(Double.parseDouble(record.get("Adj Close")));

                    allStockData.add(stockData);
//                            System.out.println(open);

                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();

            }
//        System.out.println(allStockData);

        }


    }
}
