package io.codelex.oop.summary.exercise2;


import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Invoice {
    List<SellableThing> itemList = new ArrayList<>();

    public Invoice(List<SellableThing> itemList, int invoiceNr) throws WrongOrderException {
        this.itemList = itemList;
        this.invoiceNr = invoiceNr;
        try {
            SellableThing X = itemList.get(0);
        } catch (IndexOutOfBoundsException e) {
            throw new WrongOrderException("Cannot create invoice with empty order");
        }
    }

    int invoiceNr;

    InvoiceStatus status = InvoiceStatus.APPROVED;


    public void send() {
        status = InvoiceStatus.SENT;
    }

    public String getFormattedInvoice() {
        DecimalFormat decimalFormat = new DecimalFormat("#.00");
        StringBuilder sb = new StringBuilder();
        int width = 51;
        sb.append("=".repeat(width) + "\n");
        sb.append("= INVOICE NUMBER: INV" + invoiceNr + " ".repeat(width - 22 - (Integer.toString(invoiceNr).length())) + "=\n");
        sb.append("= STATUS: " + status + (" ".repeat(width - 11 - (status.toString().length()))) + "=\n");
        for (int i = 0; i < itemList.size(); i++) {
            SellableThing item = itemList.get(i);
            sb.append("= " + (i + 1) + ". " + item.fullInfo() + (" ".repeat(width - 6 - (item.fullInfo().length())) + "=\n"));
        }
        double sum = itemList.stream().mapToDouble(SellableThing::getPrice).sum();
        double vat = sum * 0.21;
        double total = sum + vat;
        sb.append("= SUM: " + decimalFormat.format(sum) + " EUR" + (" ".repeat(width - 12 - (decimalFormat.format(sum).length()))) + "=\n");
        sb.append("= VAT (21%): " + decimalFormat.format(vat) + " EUR" + (" ".repeat(width - 18 - (decimalFormat.format(vat).length()))) + "=\n");
        sb.append("= TOTAL: " + decimalFormat.format(total) + " EUR" + (" ".repeat(width - 14 - (decimalFormat.format(total).length()))) + "=\n");
        sb.append("===================================================\n");
        return sb.toString();
    }
}