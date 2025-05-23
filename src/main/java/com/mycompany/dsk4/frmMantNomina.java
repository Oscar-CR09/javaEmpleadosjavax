/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.dsk4;


import javax.swing.JOptionPane;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.table.TableModel;
import java.util.Date; // Para la fecha
import java.text.SimpleDateFormat; // Para formatear la fecha
import com.itextpdf.text.*;

import com.itextpdf.text.pdf.PdfWriter;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Phrase;

import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
//import com.itextpdf.text.pdf.PdfPageEventHelper;
import com.itextpdf.text.BaseColor;
//import com.itextpdf.text.Rectangle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



/**
 *
 * @author oscar
 */
public class frmMantNomina extends javax.swing.JInternalFrame {
    private int fila;
    Object[] filas =new Object[6];
    javax.swing.table.DefaultTableModel modeloTabla=new javax.swing.table.DefaultTableModel();
   

    /**
     * Creates new form frmMantNomina
     */
    public frmMantNomina() {
        initComponents();
        configurarModelo();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtEmpleado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHoras = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        lblSalario = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblNeto = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabNomina = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();

        setTitle("Nomina...");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos generales del trabajador"));

        jLabel1.setText("Nombre del Empleado:");

        txtEmpleado.setText("*");

        jLabel2.setText("Horas trabajadas:");

        txtHoras.setText("*");

        jLabel3.setText("Precio por Hora:");

        txtPrecio.setText("*");

        jLabel4.setText("Salario Bruto:");

        lblSalario.setText("=");

        jLabel5.setText("Salario Neto:");

        lblNeto.setText("=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblNeto)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(lblSalario)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(lblSalario)
                    .addComponent(jLabel5)
                    .addComponent(lblNeto))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de nomina"));

        tabNomina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabNomina);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");

        btnEliminar.setText("Eliminar");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcel.setText("Excel");

        btnPdf.setText("pdf");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnExcel))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnPdf)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcel)
                    .addComponent(btnPdf))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        //detDatos();
        //modeloTabla.addRow(filas);
       // tabNomina.setModel(modeloTabla);
        calcularSalarioBruto();
        double deducciones = 50.0; // Reemplaza con el valor real de las deducciones
        calcularSalarioNeto(deducciones);
        
        
   
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        go:this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnExcel;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnPdf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNeto;
    private javax.swing.JLabel lblSalario;
    private javax.swing.JTable tabNomina;
    private javax.swing.JTextField txtEmpleado;
    private javax.swing.JTextField txtHoras;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables

     private void configurarModelo() {
        modeloTabla.addColumn("Empleado");
        modeloTabla.addColumn("Horas");
        modeloTabla.addColumn("Precio");
        modeloTabla.addColumn("Salario Neto");
        modeloTabla.addColumn("Sueldo Bruto");
     
    }
     private void detDatos() {
         //String AInteres="";
         filas[0]=txtEmpleado.getText();//carga el nombre del vector de Objecto
         filas[1]=txtHoras.getText();// carga las horas
         filas[2]=txtPrecio.getText();// carga el precio
         //filas[3]=lblNeto.getText();// carga el puesto
         //filas[4]=lblSalario.getText();// carga el puesto
                      // Ejemplo dentro de un ActionListener para un botón de cálculo
      
    }
       
      private void guardarEnExcel() {
        
    Workbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("Empleados");
    TableModel model = tabNomina.getModel();

    try {
        // Escribir los encabezados de las columnas
        Row headerRow = sheet.createRow(0);
        for (int i = 0; i < model.getColumnCount(); i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(model.getColumnName(i));
        }

        // Escribir los datos de la tabla
        for (int row = 0; row < model.getRowCount(); row++) {
            Row dataRow = sheet.createRow(row + 1);
            for (int col = 0; col < model.getColumnCount(); col++) {
                Object value = model.getValueAt(row, col);
                Cell cell = dataRow.createCell(col);
                if (value != null) {
                    cell.setCellValue(value.toString());
                } else {
                    cell.setCellValue(""); // O algún valor por defecto para celdas vacías
                }
            }
        }

        // Ajustar el ancho de las columnas al contenido
        for (int i = 0; i < model.getColumnCount(); i++) {
            sheet.autoSizeColumn(i);
        }

        // Guardar el libro de Excel en un archivo
        try (FileOutputStream outputStream = new FileOutputStream("empleados.xlsx")) {
            workbook.write(outputStream);
            JOptionPane.showMessageDialog(this, "La tabla se ha guardado en empleados.xlsx", "Guardado en Excel", JOptionPane.INFORMATION_MESSAGE);
        }
        workbook.close();

    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error al guardar el archivo Excel", "Error", JOptionPane.ERROR_MESSAGE);
        System.err.println("Error al guardar el archivo Excel: " + e.getMessage());
    }
}
    

    private void guardarEnPDF() {
           Document document = new Document();
           try {
               PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("departamentos.pdf"));

               // Configurar encabezado y pie de página
               frmMantEmpleados.HeaderFooter event = new frmMantEmpleados.HeaderFooter();
               event.setHeader("Reporte de Departamentos"); // Encabezado general
               writer.setPageEvent(event);

               document.open();

               // Título principal
               Font titleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 16);
               Paragraph title = new Paragraph("Informe Departamentos", titleFont);
               title.setAlignment(Element.ALIGN_CENTER);
               document.add(title);

               // Subtítulo 1
               Font subtitleFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 14);
               Paragraph subtitle1 = new Paragraph("Detalles de los Departamentos Registrados", subtitleFont);
               subtitle1.setAlignment(Element.ALIGN_LEFT);
               document.add(subtitle1);

               // Fecha
               SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
               Paragraph dateParagraph = new Paragraph("Fecha de Generación: " + dateFormat.format(new Date()),
                       FontFactory.getFont(FontFactory.HELVETICA, 10));
               dateParagraph.setAlignment(Element.ALIGN_RIGHT);
               document.add(dateParagraph);

               // Espacio en blanco antes de la tabla
               document.add(Chunk.NEWLINE);

               PdfPTable pdfTable = new PdfPTable(tabNomina.getColumnCount());
               pdfTable.setWidthPercentage(100);

               // Definir fuentes y colores
               Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10);
               Font cellFont = FontFactory.getFont(FontFactory.HELVETICA, 9);
               BaseColor headerColor = new BaseColor(220, 220, 220);

               TableModel model = tabNomina.getModel();

               // Escribir los encabezados de las columnas
               for (int i = 0; i < model.getColumnCount(); i++) {
                   PdfPCell cell = new PdfPCell(new Phrase(model.getColumnName(i), headerFont));
                   cell.setBackgroundColor(headerColor);
                   cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                   pdfTable.addCell(cell);
               }

               pdfTable.setHeaderRows(1);

               // Escribir los datos de la tabla
               for (int row = 0; row < model.getRowCount(); row++) {
                   for (int col = 0; col < model.getColumnCount(); col++) {
                       Object value = model.getValueAt(row, col);
                       PdfPCell cell = new PdfPCell(new Phrase(value != null ? value.toString() : "", cellFont));
                       pdfTable.addCell(cell);
                   }
               }

               document.add(pdfTable);

               // Subtítulo 2 (después de la tabla)
               Paragraph subtitle2 = new Paragraph("Resumen de Datos", subtitleFont);
               subtitle2.setAlignment(Element.ALIGN_LEFT);
               document.add(Chunk.NEWLINE); // Espacio en blanco antes del subtítulo
               document.add(subtitle2);

               // Subtítulo 3 (ejemplo de contenido adicional)
               Paragraph subtitle3 = new Paragraph("Información Adicional", subtitleFont);
               subtitle3.setAlignment(Element.ALIGN_LEFT);
               document.add(Chunk.NEWLINE);
               document.add(subtitle3);

               document.close();
               JOptionPane.showMessageDialog(this, "La tabla se ha guardado en Departamentos.pdf", "Guardado en PDF",
                       JOptionPane.INFORMATION_MESSAGE);

           } catch (DocumentException e) {
               JOptionPane.showMessageDialog(this, "Error al crear el documento PDF", "Error", JOptionPane.ERROR_MESSAGE);
               e.printStackTrace();
           } catch (IOException e) {
               JOptionPane.showMessageDialog(this, "Error al guardar el archivo PDF", "Error", JOptionPane.ERROR_MESSAGE);
               e.printStackTrace();
           }
       }
    
     public void calcularSalarioBruto() {
        try {
            double horasTrabajadas = Double.parseDouble(txtHoras.getText());
            double precioPorHora = Double.parseDouble(txtPrecio.getText());
            double salarioBruto = horasTrabajadas * precioPorHora;

            // Formatear el salario bruto a dos decimales (opcional)
            String salarioFormateado = String.format("%.2f", salarioBruto);

            lblSalario.setText(salarioFormateado);
            filas[4] = salarioFormateado; // Guarda el salario bruto en el array de filas
        } catch (NumberFormatException e) {
            lblSalario.setText("Error"); // Manejar el error si las horas o el precio no son números válidos
            filas[4] = "";
        }
    }

    public void calcularSalarioNeto(double deducciones) {
        try {
            double salarioBruto = Double.parseDouble(lblSalario.getText().replace(",", "")); // Asegurarse de eliminar comas si las hay
            double salarioNeto = salarioBruto - deducciones;

            // Formatear el salario neto a dos decimales (opcional)
            String salarioNetoFormateado = String.format("%.2f", salarioNeto);

            lblNeto.setText(salarioNetoFormateado);
            filas[3] = salarioNetoFormateado; // Guarda el salario neto en el array de filas
        } catch (NumberFormatException e) {
            lblNeto.setText("Error"); // Manejar el error si el salario bruto no es un número válido
            filas[3] = "";
        } finally {
            detDatos(); // Asegurarse de que los datos básicos estén actualizados
            modeloTabla.addRow(filas); // Agrega la fila completa a la tabla
            tabNomina.setModel(modeloTabla); // Actualiza el modelo de la tabla
               //detDatos();
            //modeloTabla.addRow(filas);
            // tabNomina.setModel(modeloTabla);
        }
    }




}
