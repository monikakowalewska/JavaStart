package utils;

import exception.NoSuchFileTypeException;

public class FileManagerBuilder {
	private ConsolePrinter printer;

    private DataReader reader;



    public FileManagerBuilder(ConsolePrinter printer, DataReader reader) {

        this.printer = printer;

        this.reader = reader;

    }



    public FileManager build() {

        printer.printLine("Wybierz format danych:");

        FileType fileType = getFileType();

        switch (fileType) {

            case CSV:

                return new CsvFileManager();

            case SERIAL:

                return new SerializableFileManager();

            default:

                throw new NoSuchFileTypeException("Nieobs³ugiwany typ danych");

        }

    }



    private FileType getFileType() {

        boolean typeOk = false;

        FileType result = null;

        do {

            printTypes();

            String type = reader.getString().toUpperCase();

            try {

                result = FileType.valueOf(type);

                typeOk = true;

            } catch (IllegalArgumentException e) {

                printer.printLine("Nieobs³ugiwany typ danych, wybierz ponownie.");

            }

        } while (!typeOk);



        return result;

    }



    private void printTypes() {

        for (FileType value : FileType.values()) {

            printer.printLine(value.name());

        }

    }
}
