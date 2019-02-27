package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import data.Library;
import exception.DataExportException;
import exception.DataImportException;

public class SerializableFileManager implements FileManager {
	private static final String FILE_NAME = "Library.o";



    @Override

    public void exportData(Library library) {

        try (FileOutputStream fos = new FileOutputStream(FILE_NAME);

             ObjectOutputStream oos = new ObjectOutputStream(fos);

             ){

            oos.writeObject(library);

        } catch (FileNotFoundException e) {

            throw new DataExportException("Brak pliku " + FILE_NAME);

        } catch (IOException e) {

            throw new DataExportException("B��d zapisu danych do pliku " + FILE_NAME);

        }

    }



    @Override

    public Library importData() {

        try (FileInputStream fis = new FileInputStream(FILE_NAME);

             ObjectInputStream ois = new ObjectInputStream(fis);

             ) {

            return (Library) ois.readObject();

        } catch (FileNotFoundException e) {

            throw new DataImportException("Brak pliku " + FILE_NAME);

        } catch (IOException e) {

            throw new DataImportException("B��d odczytu pliku " + FILE_NAME);

        } catch (ClassNotFoundException e) {

            throw new DataImportException("Niezgodny typ danych w pliku " + FILE_NAME);

        }

    }
}
