interface Exportable {
    void exportToCSV();
    void exportToPDF();
    
    default void exportToJSON() {
        System.out.println("Default export to JSON logic...");
    }
}

class CSVExporter implements Exportable {
    public void exportToCSV() {
        System.out.println("Exporting data to CSV file.");
    }
    public void exportToPDF() {
        System.out.println("Exporting data to PDF file.");
    }
}

public class ExportDemo {
    public static void main(String[] args) {
        Exportable report = new CSVExporter();
        
        report.exportToCSV();
        report.exportToJSON(); // Works without the class implementing it
    }
}