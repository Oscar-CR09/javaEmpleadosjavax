/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package com.mycompany.dsk4;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


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


/**
 *
 * @author oscar
 */
public class frmMantDepaEmpleados extends javax.swing.JInternalFrame {
    private int fila;
    Object[] filas =new Object[6];
    javax.swing.table.DefaultTableModel modeloTabla=new javax.swing.table.DefaultTableModel();
   

    /**
     * Creates new form frmMantDepaEmpleados
     */
    public frmMantDepaEmpleados() {
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
        txtDepartamento = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtJefe = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtPuesto = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabDepartamentos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnExcel = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();

        setTitle("Departamentos");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos Generales del Departamento"));

        jLabel1.setText("Nombre del departamento:");

        txtDepartamento.setText("*");

        jLabel2.setText("Jefe directo:");

        txtJefe.setText("*");

        jLabel3.setText("Puesto:");

        txtPuesto.setText("*");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDepartamento)
                    .addComponent(txtJefe, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                    .addComponent(txtPuesto))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtJefe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Departamentos"));

        tabDepartamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabDepartamentos);

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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExcel.setText("Excel");
        btnExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcelActionPerformed(evt);
            }
        });

        btnPdf.setText("PDF");
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(btnExcel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 334, Short.MAX_VALUE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnPdf, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)))
                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(159, 159, 159))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnModificar)
                    .addComponent(btnEliminar)
                    .addComponent(btnCancelar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcel)
                    .addComponent(btnPdf))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        modeloTabla.removeRow(fila);//elimina fila determinada
        tabDepartamentos.setModel(modeloTabla);
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
            detDatos();
        for (int i = 0; i < 6; i++) {//para la 6 columnas de la tabla
            modeloTabla.setValueAt(filas[i], fila, i);//Cambie en el modelo por lo que tiene almacenado el vector de filas
            tabDepartamentos.setModel(modeloTabla);//Actualiza la tabla //(JTable) con el modelo
                        
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        detDatos();
        modeloTabla.addRow(filas);
        tabDepartamentos.setModel(modeloTabla);
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        go:this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcelActionPerformed
        // TODO add your handling code here:
        guardarEnExcel();
    }//GEN-LAST:event_btnExcelActionPerformed

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        // TODO add your handling code here:
        guardarEnPDF();
    }//GEN-LAST:event_btnPdfActionPerformed


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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabDepartamentos;
    private javax.swing.JTextField txtDepartamento;
    private javax.swing.JTextField txtJefe;
    private javax.swing.JTextField txtPuesto;
    // End of variables declaration//GEN-END:variables

      private void configurarModelo() {
        modeloTabla.addColumn("Departamento");
        modeloTabla.addColumn("Jefe directo");
        modeloTabla.addColumn("Puesto");
     
    }
      
       private void detDatos() {
         String AInteres="";
         filas[0]=txtDepartamento.getText();//carga el nombre del vector de Objecto
         filas[1]=txtJefe.getText();// carga el jefe
         filas[2]=txtPuesto.getText();// carga el puesto
        
         //filas[5]=AInteres; //Agrega en la columna 5 la variable AInteres
    }
       
       private void guardarEnExcel() {
        
    Workbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("Empleados");
    TableModel model = tabDepartamentos.getModel();

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

               PdfPTable pdfTable = new PdfPTable(tabDepartamentos.getColumnCount());
               pdfTable.setWidthPercentage(100);

               // Definir fuentes y colores
               Font headerFont = FontFactory.getFont(FontFactory.HELVETICA_BOLD, 10);
               Font cellFont = FontFactory.getFont(FontFactory.HELVETICA, 9);
               BaseColor headerColor = new BaseColor(220, 220, 220);

               TableModel model = tabDepartamentos.getModel();

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




}

