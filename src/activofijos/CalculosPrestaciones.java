
package activofijos;
import ClaseConectar.Conectar;
import java.sql.*;
import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.text.NumberFormat;
import java.text.DecimalFormat;

public class CalculosPrestaciones extends javax.swing.JFrame {

        
   
    
    public CalculosPrestaciones() {
        initComponents();

       // Texto preseleccionado
       
       jTextSueldo1.addFocusListener( new FullSelectorListener() );
       jTextSueldo2.addFocusListener( new FullSelectorListener() );
       jTextSueldo3.addFocusListener( new FullSelectorListener() );
       jTextSueldo4.addFocusListener( new FullSelectorListener() );
       jTextSueldo5.addFocusListener( new FullSelectorListener() );
       jTextSueldo6.addFocusListener( new FullSelectorListener() );

             
    }

       
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jTextNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFechaI = new javax.swing.JTextField();
        jTextFechaE = new javax.swing.JTextField();
        jTextPuesto = new javax.swing.JTextField();
        jTextAnios = new javax.swing.JTextField();
        jTextMeses = new javax.swing.JTextField();
        jTextDias = new javax.swing.JTextField();
        jTextSueldoOrdinarioMensual = new javax.swing.JTextField();
        jTextSueldoOrdinarioPromedioMensual = new javax.swing.JTextField();
        jTextSueldoOrdinarioDiario = new javax.swing.JTextField();
        jTextSueldoOrdinarioPromedioDiario = new javax.swing.JTextField();
        jTextSueldoPromedioMensual = new javax.swing.JTextField();
        jTextSueldoPromedioDiario = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextPreaviso = new javax.swing.JTextField();
        jTextAuxilioCesantia = new javax.swing.JTextField();
        jTextAuxilioCesantiaProporcional = new javax.swing.JTextField();
        jTextVacaciones1 = new javax.swing.JTextField();
        jTextVacaciones2 = new javax.swing.JTextField();
        jTextVacaciones3 = new javax.swing.JTextField();
        jTextVacaciones4 = new javax.swing.JTextField();
        jTextVacacionesProporcionales = new javax.swing.JTextField();
        jTextAguinaldo = new javax.swing.JTextField();
        jTextAguinaldoProporcional = new javax.swing.JTextField();
        jTextDecimoCuartoMes = new javax.swing.JTextField();
        jTextDecimoCuartoMesProporcional = new javax.swing.JTextField();
        jTextTotal = new javax.swing.JTextField();
        jTextPreavisoDias = new javax.swing.JTextField();
        jTextCesantiaDias = new javax.swing.JTextField();
        jTextCesantiaDiasPromedio = new javax.swing.JTextField();
        jTextField31 = new javax.swing.JTextField();
        jTextField32 = new javax.swing.JTextField();
        jTextField33 = new javax.swing.JTextField();
        jTextField34 = new javax.swing.JTextField();
        jTextField35 = new javax.swing.JTextField();
        jTextField36 = new javax.swing.JTextField();
        jTextField37 = new javax.swing.JTextField();
        jTextField38 = new javax.swing.JTextField();
        jTextField39 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jTextSueldo1 = new javax.swing.JTextField();
        jTextSueldo2 = new javax.swing.JTextField();
        jTextSueldo4 = new javax.swing.JTextField();
        jTextSueldo3 = new javax.swing.JTextField();
        jTextSueldo6 = new javax.swing.JTextField();
        jTextSueldo5 = new javax.swing.JTextField();
        jTextSumaSueldo = new javax.swing.JTextField();
        jTextHoraExtra6 = new javax.swing.JTextField();
        jTextHoraExtra5 = new javax.swing.JTextField();
        jTextField50 = new javax.swing.JTextField();
        jTextHoraExtra2 = new javax.swing.JTextField();
        jTextHoraExtra4 = new javax.swing.JTextField();
        jTextHoraExtra3 = new javax.swing.JTextField();
        jTextHoraExtra1 = new javax.swing.JTextField();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jTextField54 = new javax.swing.JTextField();
        jTextField55 = new javax.swing.JTextField();
        jTextField56 = new javax.swing.JTextField();
        jTextField57 = new javax.swing.JTextField();
        jTextField58 = new javax.swing.JTextField();
        jTextField59 = new javax.swing.JTextField();
        jTextField60 = new javax.swing.JTextField();
        jTextField61 = new javax.swing.JTextField();
        jTextField62 = new javax.swing.JTextField();
        jTextField63 = new javax.swing.JTextField();
        jTextField64 = new javax.swing.JTextField();
        jTextField66 = new javax.swing.JTextField();
        jTextComision6 = new javax.swing.JTextField();
        jTextComision4 = new javax.swing.JTextField();
        jTextComision3 = new javax.swing.JTextField();
        jTextSumaComision = new javax.swing.JTextField();
        jTextComision2 = new javax.swing.JTextField();
        jLabel44 = new javax.swing.JLabel();
        jTextComision1 = new javax.swing.JTextField();
        jTextComision5 = new javax.swing.JTextField();
        jTextField74 = new javax.swing.JTextField();
        jTextField75 = new javax.swing.JTextField();
        jTextField76 = new javax.swing.JTextField();
        jTextField77 = new javax.swing.JTextField();
        jTextField78 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextSumaHoraExtra = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel46 = new javax.swing.JLabel();
        jTextIdentidad = new javax.swing.JTextField();
        jLabel47 = new javax.swing.JLabel();
        jTextZona = new javax.swing.JTextField();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jTextTotalDias = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jTextDiasProporcionales = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Nombre:");

        jLabel2.setText("Fecha de Ingreso:");

        jLabel3.setText("Fecha de Egreso :");

        jLabel4.setText("Puesto:");

        jLabel5.setText("Sueldo Ordinario Mensual");

        jLabel6.setText("Meses:");

        jLabel7.setText("Dias:");

        jTextFechaI.setText(" ");

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTextFechaE, org.jdesktop.beansbinding.ObjectProperty.create(), jTextFechaI, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jTextFechaE.setText(" ");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTextSueldo1, org.jdesktop.beansbinding.ObjectProperty.create(), jTextFechaE, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jTextPuesto.setText(" ");

        jTextSueldoOrdinarioMensual.setHorizontalAlignment(javax.swing.JTextField.TRAILING);
        jTextSueldoOrdinarioMensual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSueldoOrdinarioMensualActionPerformed(evt);
            }
        });

        jLabel8.setText("Años:");

        jLabel9.setText("Sueldo Promedio Mensual");

        jLabel10.setText("Sueldo Ordinario Promedio Mensual");

        jLabel11.setText("Sueldo Ordinario Diario");

        jLabel12.setText("Sueldo Ordinario Promedio Diario");

        jLabel13.setText("Sueldo Promedio Diario");

        jLabel14.setText("Preaviso");

        jLabel15.setText("Auxilio de Cesantia");

        jLabel16.setText("Auxilio de Cesantia Proporcional");

        jLabel17.setText("Vacaciones 1er Año");

        jLabel18.setText("Vacaciones 2do Año");

        jLabel19.setText("Vacaciones 3er Año");

        jLabel20.setText("Vacaciones 4to Año");

        jLabel21.setText("Vacaciones Proporcionales ");

        jLabel22.setText("Decimo Tercer Mes");

        jLabel23.setText("Decimo Tercer Mes Proporcional");

        jLabel24.setText("Decimo Cuarto Mes");

        jLabel25.setText("Decimo Cuarto Mes Proporcional");

        jLabel27.setText("Total...........................");

        jTextField14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField14ActionPerformed(evt);
            }
        });

        jTextPreaviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPreavisoActionPerformed(evt);
            }
        });

        jTextPreavisoDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextPreavisoDiasActionPerformed(evt);
            }
        });

        jTextCesantiaDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCesantiaDiasActionPerformed(evt);
            }
        });

        jTextCesantiaDiasPromedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCesantiaDiasPromedioActionPerformed(evt);
            }
        });

        jTextField31.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField31ActionPerformed(evt);
            }
        });

        jTextField32.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField32ActionPerformed(evt);
            }
        });

        jTextField33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField33ActionPerformed(evt);
            }
        });

        jTextField34.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField34ActionPerformed(evt);
            }
        });

        jTextField35.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField35ActionPerformed(evt);
            }
        });

        jTextField36.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField36ActionPerformed(evt);
            }
        });

        jTextField37.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField37ActionPerformed(evt);
            }
        });

        jTextField38.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField38ActionPerformed(evt);
            }
        });

        jTextField39.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField39ActionPerformed(evt);
            }
        });

        jLabel26.setText("Dias");

        jLabel29.setText("Dias");

        jLabel30.setText("Dias");

        jLabel32.setText("Dias");

        jLabel33.setText("Dias");

        jLabel34.setText("Dias");

        jLabel36.setText("Dias");

        jLabel37.setText("Dias");

        jLabel38.setText("Dias");

        jLabel39.setText("Dias");

        jTextSueldo1.setText("0.00");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTextSueldo2, org.jdesktop.beansbinding.ObjectProperty.create(), jTextSueldo1, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jTextSueldo1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextSueldo1FocusLost(evt);
            }
        });
        jTextSueldo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSueldo1ActionPerformed(evt);
            }
        });

        jTextSueldo2.setText("0.00");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTextSueldo3, org.jdesktop.beansbinding.ObjectProperty.create(), jTextSueldo2, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jTextSueldo2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextSueldo2FocusLost(evt);
            }
        });

        jTextSueldo4.setText("0.00");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTextSueldo5, org.jdesktop.beansbinding.ObjectProperty.create(), jTextSueldo4, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jTextSueldo4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextSueldo4FocusLost(evt);
            }
        });
        jTextSueldo4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSueldo4ActionPerformed(evt);
            }
        });

        jTextSueldo3.setText("0.00");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTextSueldo4, org.jdesktop.beansbinding.ObjectProperty.create(), jTextSueldo3, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jTextSueldo3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextSueldo3FocusLost(evt);
            }
        });

        jTextSueldo6.setText("0.00");
        jTextSueldo6.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextSueldo6FocusLost(evt);
            }
        });

        jTextSueldo5.setText("0.00");

        binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, jTextSueldo6, org.jdesktop.beansbinding.ObjectProperty.create(), jTextSueldo5, org.jdesktop.beansbinding.BeanProperty.create("nextFocusableComponent"));
        bindingGroup.addBinding(binding);

        jTextSueldo5.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextSueldo5FocusLost(evt);
            }
        });

        jTextSumaSueldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextSumaSueldoActionPerformed(evt);
            }
        });

        jTextHoraExtra6.setText("0.00");

        jTextHoraExtra5.setText("0.00");

        jTextHoraExtra2.setText("0.00");

        jTextHoraExtra4.setText("0.00");

        jTextHoraExtra3.setText("0.00");

        jTextHoraExtra1.setText("0.00");

        jLabel42.setText("SUELDO PROMEDIO");

        jLabel43.setText("HORAS EXTRAS PROMEDIO");

        jTextField58.setText(" ");

        jTextField64.setText(" ");

        jTextComision6.setText("0.00");

        jTextComision4.setText("0.00");

        jTextComision3.setText("0.00");

        jTextComision2.setText("0.00");

        jLabel44.setText("COMISION PROMEDIO");

        jTextComision1.setText("0.00");

        jTextComision5.setText("0.00");

        jTextField78.setText(" ");

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setText("Guardar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel46.setText("Identidad");

        jTextIdentidad.setText(" ");

        jLabel47.setText("Zona");

        jTextZona.setText(" ");

        jLabel48.setText("Dias");

        jLabel49.setText("Dias");

        jButton3.setText("Calcular");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel28.setText("Total dias");

        jLabel31.setText("Proporcionales");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(12, 12, 12)
                                .addComponent(jTextFechaE, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextSueldoPromedioMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextSueldoOrdinarioPromedioMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextSueldoOrdinarioMensual, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(26, 92, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextSueldoOrdinarioDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextSueldoOrdinarioPromedioDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextSueldoPromedioDiario, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel47)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel46)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(jTextIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jTextZona, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(205, 205, 205)
                                .addComponent(jButton3)
                                .addGap(18, 18, 18)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextAnios, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextMeses, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextTotalDias, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextDias, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel31)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextDiasProporcionales, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addContainerGap(45, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 1130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 57, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel27)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel22)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel21)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel20)
                                    .addComponent(jLabel19)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel17)
                                        .addComponent(jLabel18))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16)
                                            .addComponent(jLabel14))))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextPreaviso, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(jTextAuxilioCesantia)
                                            .addComponent(jTextAuxilioCesantiaProporcional)
                                            .addComponent(jTextVacaciones1)
                                            .addComponent(jTextVacaciones2)
                                            .addComponent(jTextVacaciones3)
                                            .addComponent(jTextVacaciones4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextVacacionesProporcionales)
                                            .addComponent(jTextAguinaldo)
                                            .addComponent(jTextAguinaldoProporcional)
                                            .addComponent(jTextDecimoCuartoMes)
                                            .addComponent(jTextDecimoCuartoMesProporcional))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextPreavisoDias)
                                            .addComponent(jTextCesantiaDias, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                            .addComponent(jTextCesantiaDiasPromedio)
                                            .addComponent(jTextField31)
                                            .addComponent(jTextField32)
                                            .addComponent(jTextField33)
                                            .addComponent(jTextField34)
                                            .addComponent(jTextField35)
                                            .addComponent(jTextField36)
                                            .addComponent(jTextField37)
                                            .addComponent(jTextField38)
                                            .addComponent(jTextField39))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel26)
                                            .addComponent(jLabel29)
                                            .addComponent(jLabel38)
                                            .addComponent(jLabel39)
                                            .addComponent(jLabel34)
                                            .addComponent(jLabel36)
                                            .addComponent(jLabel37)
                                            .addComponent(jLabel30)
                                            .addComponent(jLabel32)
                                            .addComponent(jLabel33)
                                            .addComponent(jLabel49)
                                            .addComponent(jLabel48))
                                        .addGap(59, 59, 59)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jTextField56, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(jTextField58, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField57, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField55, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jTextField54, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel42))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTextSumaSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextSueldo6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                                .addComponent(jTextSueldo5, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextSueldo4, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextSueldo3, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextSueldo2, javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jTextSueldo1, javax.swing.GroupLayout.Alignment.LEADING)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(40, 40, 40)
                                                .addComponent(jLabel44))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextField74)
                                                    .addComponent(jTextField76)
                                                    .addComponent(jTextField66)
                                                    .addComponent(jTextField78)
                                                    .addComponent(jTextField77)
                                                    .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextComision4)
                                                    .addComponent(jTextComision6)
                                                    .addComponent(jTextComision1)
                                                    .addComponent(jTextComision2)
                                                    .addComponent(jTextComision3)
                                                    .addComponent(jTextComision5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(124, 124, 124)
                                                .addComponent(jTextSumaComision, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel43)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(115, 115, 115)
                                                .addComponent(jTextSumaHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(3, 3, 3)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jTextField50, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField64, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField63, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField61, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jTextField60, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(jTextHoraExtra4)
                                                    .addComponent(jTextHoraExtra6)
                                                    .addComponent(jTextHoraExtra1)
                                                    .addComponent(jTextHoraExtra2)
                                                    .addComponent(jTextHoraExtra3)
                                                    .addComponent(jTextHoraExtra5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                    .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(72, 72, 72)
                                .addComponent(jTextPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel46)
                                .addComponent(jTextIdentidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jTextZona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addComponent(jLabel47)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1)
                                    .addComponent(jTextNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jTextFechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton3)
                                .addComponent(jButton1)
                                .addComponent(jButton2)))
                        .addGap(2, 2, 2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextAnios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jTextMeses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jTextDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextDiasProporcionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel31))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextTotalDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel28))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel3))
                            .addComponent(jTextFechaE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextPuesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextSueldoOrdinarioMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextSueldoOrdinarioPromedioMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextSueldoPromedioMensual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextSueldoOrdinarioDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextSueldoOrdinarioPromedioDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextSueldoPromedioDiario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel44)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField66, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextComision1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField76, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextComision2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField78, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextComision3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField77, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextComision4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField75, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextComision5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField74, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextComision6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextSumaComision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel42)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextSueldo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField59, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextSueldo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField56, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextSueldo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField58, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextSueldo4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField57, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextSueldo5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField55, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextSueldo6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField54, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextSumaSueldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel43)
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextHoraExtra1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField62, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextHoraExtra2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField64, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextHoraExtra3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField63, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextHoraExtra4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField61, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextHoraExtra5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField60, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextHoraExtra6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextSumaHoraExtra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPreaviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextAuxilioCesantia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextAuxilioCesantiaProporcional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel16))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextVacaciones1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel17))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextVacaciones2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextVacaciones3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextVacaciones4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel20))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextVacacionesProporcionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21)
                                    .addComponent(jTextField14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextAguinaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel22))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextAguinaldoProporcional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel23))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextDecimoCuartoMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel24)
                                    .addComponent(jTextField38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel48))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextDecimoCuartoMesProporcional, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel25)
                                    .addComponent(jTextField39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel49)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextPreavisoDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextCesantiaDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel29))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextCesantiaDiasPromedio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel30))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel32))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel33))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel34))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel37))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel38))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel39))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel27))))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField14ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField14ActionPerformed

    private void jTextPreavisoDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPreavisoDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPreavisoDiasActionPerformed

    private void jTextCesantiaDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCesantiaDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCesantiaDiasActionPerformed

    private void jTextCesantiaDiasPromedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCesantiaDiasPromedioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCesantiaDiasPromedioActionPerformed

    private void jTextField31ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField31ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField31ActionPerformed

    private void jTextField32ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField32ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField32ActionPerformed

    private void jTextField33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField33ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField33ActionPerformed

    private void jTextField34ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField34ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField34ActionPerformed

    private void jTextField35ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField35ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField35ActionPerformed

    private void jTextField36ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField36ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField36ActionPerformed

    private void jTextField37ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField37ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField37ActionPerformed

    private void jTextField38ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField38ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField38ActionPerformed

    private void jTextField39ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField39ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField39ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Menuprincipal Me = new Menuprincipal();
        Me.setExtendedState(CalculosPrestaciones.MAXIMIZED_BOTH);
        Me.setLocationRelativeTo(null);
        Me.setDefaultCloseOperation(CalculosPrestaciones.EXIT_ON_CLOSE );
        Me.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        String cIdentidad_id = "";
        String cNombre = "";
        String cSueldo1 = "";
        String cSueldo2 = "";
        String cSueldo3 = "";
        String cSueldo4 = "";
        String cSueldo5 = "";
        String cSueldo6 = "";
        String cFechaI = "";
        String cFechaE = "";
        String cZona = "";
        String cPuesto = "";
        String nComision1 = "";
        String nComision2 = "";
        String nComision3 = "";
        String nComision4 = "";
        String nComision5 = "";
        String nComision6 = "";
        String cHoraExtra1 = "";
        String cHoraExtra2 = "";
        String cHoraExtra3 = "";
        String cHoraExtra4 = "";
        String cHoraExtra5 = "";
        String cHoraExtra6 = "";
        String cSumaSueldo = "";
        String cSumaComision = "";
        String cSumaHoraExtra = "";
        String cAuxilioCesantia = "";
        String cAuxilioCesantiaP = "";
        String cVacaciones1 = "";
        String cVacacionesProporcionales = "";
        String cAguinaldo = "";
        String cAguinaldoProporcional = "";
        String cDecimoCuartoMes = "";
        String cDecimoCuartoMesProporcional = "";
        String cTempo = "";

        //nCodigoactivos = Integer.parseInt(jTextcodigoactivos.getText());

        cIdentidad_id  = jTextIdentidad.getText();
        cNombre = jTextNombre.getText();
        cSueldo1 = jTextSueldo1.getText();
        cSueldo2 = jTextSueldo2.getText();
        cSueldo3 = jTextSueldo3.getText();
        cSueldo4 = jTextSueldo4.getText();
        cSueldo5 = jTextSueldo5.getText();
        cSueldo6 = jTextSueldo6.getText();
        cFechaI = jTextFechaI.getText();
        cFechaE = jTextFechaE.getText();
        cZona = jTextZona.getText();
        cPuesto = jTextPuesto.getText();
        nComision1 = jTextComision1.getText();
        nComision2 = jTextComision2.getText();
        nComision3 = jTextComision3.getText();
        nComision4 = jTextComision4.getText();
        nComision5 = jTextComision5.getText();
        nComision6 = jTextComision6.getText();
        cHoraExtra1 = jTextHoraExtra1.getText();
        cHoraExtra2 = jTextHoraExtra2.getText();
        cHoraExtra3 = jTextHoraExtra3.getText();
        cHoraExtra4 = jTextHoraExtra4.getText();
        cHoraExtra5 = jTextHoraExtra5.getText();
        cHoraExtra6 = jTextHoraExtra6.getText();
        cSumaSueldo = jTextSumaSueldo.getText();
        cSumaComision = jTextSumaComision.getText();
        cSumaHoraExtra = jTextSumaHoraExtra.getText();
        cAuxilioCesantia = jTextAuxilioCesantia.getText();
        cAuxilioCesantiaP = jTextAuxilioCesantiaProporcional.getText();
        cVacaciones1 = jTextVacaciones1.getText();
        cVacacionesProporcionales = jTextVacacionesProporcionales.getText();
        cAguinaldo = jTextAguinaldo.getText();
        cAguinaldoProporcional = jTextAguinaldoProporcional.getText();
        cDecimoCuartoMes = jTextDecimoCuartoMes.getText();
        cDecimoCuartoMesProporcional = jTextDecimoCuartoMesProporcional.getText();
        

        //JOptionPane.showMessageDialog(null,  "Se ejecuta ", "Contenido", JOptionPane.INFORMATION_MESSAGE );

        // Codigo para conectarse y grabar en la base de datos

        Conectar nConexion = new Conectar();
        nConexion.conectar();
        Statement st = nConexion.conexion();

        String cSql;
        cSql = "INSERT INTO persona " +
        //"(activo_id, descripcion, marca, modelo, serie, discoduro, menoriaram, ip, mac, procesador, so,"
        //+ " version_no, arquitectura, color, cajachica, ubicacion_id, responsable_id, estado_id, numerofactura,"
        //+ " cheque, clase_id, vogue_id, empleado_id, proveedor_id, monto, fecha, fechainventario, fechagarantia )" +
        " SELECT '" + cIdentidad_id  + "' " +
        "   ,'" + cNombre + "' " +
        "   ,'" + cSueldo1 + "'" +
        "   ,'" + cSueldo2 + "'" +
        "   ,'" + cSueldo3 + "'" +
        "   ,'" + cSueldo4 + "'" +
        "   ,'" + cSueldo5 + "'" +
        "   ,'" + cSueldo6 + "'" +
        "   ,'" + cFechaI + "'" +
        "   ,'" + cFechaE + "'" +
        "   ,'" + cZona + "'" +
        "   ,'" + cPuesto + "'" +
        "   ,'" + nComision1 + "'" +
        "   ,'" + nComision2 + "'" +
        "   ,'" + nComision3 + "'" +
        "   ,'" + nComision4 + "'" +
        "   ,'" + nComision5 + "'" +
        "   ,'" + nComision6 + "'" +
        "   ,'" + cHoraExtra1 + "'" +
        "   ,'" + cHoraExtra2 + "'" +
        "   ,'" + cHoraExtra3 + "'" +
        "   ,'" + cHoraExtra4 + "'" +
        "   ,'" + cHoraExtra5 + "'" +
        "   ,'" + cHoraExtra6 + "'" +
        "   ,'" + cSumaSueldo + "'" +
        "   ,'" + cSumaComision + "'" +
        "   ,'" + cSumaHoraExtra + "'" +
        "   ,'" + cAuxilioCesantia + "'" +
        "   ,'" + cAuxilioCesantiaP + "'" +     
        "   ,'" + cVacaciones1 + "'" +
        "   ,'" + cVacacionesProporcionales + "'" +
        "   ,'" + cAguinaldo + "'" +
        "   ,'" + cAguinaldoProporcional + "'" +
        "   ,'" + cDecimoCuartoMes + "'" +
        "   ,'" + cDecimoCuartoMesProporcional + "'" +                
        " WHERE NOT EXISTS " +
        "    ( SELECT * FROM personas " +
        "         WHERE Identidad_id  = '" + cIdentidad_id  + "' )";

        nConexion.slqActualiza(st, cSql);
        nConexion.cerrar(st);
        nConexion.desconectar();
        
        

        //JOptionPane.showMessageDialog(null,  "Instruccion SQL " + cSql, "Contenido", JOptionPane.INFORMATION_MESSAGE );
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextSumaSueldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSumaSueldoActionPerformed
        // TODO add your handling code here:
         
        
        
        
    }//GEN-LAST:event_jTextSumaSueldoActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
       Formatter miFormato = new Formatter();  
       Formatter miFormato1 = new Formatter(); 
       Formatter miFormato2 = new Formatter();
       Formatter miFormato3 = new Formatter();
       Formatter miFormato4 = new Formatter();
       Formatter miFormato5 = new Formatter();
       Formatter miFormato6 = new Formatter();
       Formatter miFormato7 = new Formatter();
       Formatter miFormato8 = new Formatter();
       Formatter miFormato9 = new Formatter();
       Formatter miFormato10 = new Formatter();
       Formatter miFormato11 = new Formatter();
       DecimalFormat miCesantiaDiasProporcionales = new DecimalFormat("####.0000");
       Formatter miCesantiaProporcional = new Formatter();
       
       double nPromedio = 0.0;
       double nPromedio1 = 0.0;
       double nPromedio2 = 0.0;
       double nPromedio3 = 0.0;
       double nPromedio4 = 0.0;
       double nPromedio5 = 0.0;
       double nPromedio6 = 0.0;
       double nPromedio7 = 0.0;
       double nPromedio8 = 0.0;
       double nPromedio9 = 0.0;
       double nPromedio10 = 0.0;
       double nAuxilioCesantia = 0.0;
       double nProporcionalAuxilioCesantia = 0.0;
       
       // Dias laborados
       int diasLaborados =0;
       
      
       // Año, mes y día resultado
       int  AnioR = 0;
       int  MesR = 0;
       int  DiaR = 0;

       // Dias Totales y proporcionales
       int DiasTotales = 0;
       int DiasProporcionales = 0;
       
       
       double val1 = Double.parseDouble(jTextSueldo1.getText());
       double val2 = Double.parseDouble(jTextSueldo2.getText());
       double val3 = Double.parseDouble(jTextSueldo3.getText());
       double val4 = Double.parseDouble(jTextSueldo4.getText());
       double val5 = Double.parseDouble(jTextSueldo5.getText());
       double val6 = Double.parseDouble(jTextSueldo6.getText());
       double val7 = Double.parseDouble(jTextComision1.getText());
       double val8 = Double.parseDouble(jTextComision2.getText());
       double val9 = Double.parseDouble(jTextComision3.getText());
       double val10 = Double.parseDouble(jTextComision4.getText());
       double val11 = Double.parseDouble(jTextComision5.getText());
       double val12 = Double.parseDouble(jTextComision6.getText()); 
       double val13 = Double.parseDouble(jTextHoraExtra1.getText());
       double val14 = Double.parseDouble(jTextHoraExtra2.getText());
       double val15 = Double.parseDouble(jTextHoraExtra3.getText());
       double val16 = Double.parseDouble(jTextHoraExtra4.getText());
       double val17 = Double.parseDouble(jTextHoraExtra5.getText());
       double val18 = Double.parseDouble(jTextHoraExtra6.getText());
       
     
       
       // Calculo de dias meses y años
       Date FechaInicial = DeStringADate(jTextFechaI.getText() );
       Date FechaFinal = DeStringADate(jTextFechaE.getText() );
      
       diasLaborados = calcularDias(FechaInicial, FechaFinal);
             
       DiasTotales = diasLaborados;
       AnioR = diasLaborados / 360;
      
       diasLaborados = diasLaborados - (AnioR * 360);
       MesR = diasLaborados / 30;
       
       diasLaborados = diasLaborados - (MesR * 30);
       DiaR = diasLaborados;
              
       DiasProporcionales = DiaR + (MesR * 30);
       
       
       // Colocar valores años, mese y días en los textBox
       jTextAnios.setText(String.valueOf(AnioR));
       jTextMeses.setText(String.valueOf(MesR));
       jTextDias.setText(String.valueOf(DiaR));
       jTextTotalDias.setText(String.valueOf(DiasTotales));
       jTextDiasProporcionales.setText(String.valueOf(DiasProporcionales));
       
       // Calcular los días de preaviso
       int nDias = diasPreaviso(  (MesR + (AnioR * 12)) );
       jTextPreavisoDias.setText(String.valueOf(nDias));
       
       // Calcular los días de cesantía
       int nDiasCesantia = diasCesantia(  (MesR + (AnioR * 12)) );
       jTextCesantiaDias.setText(String.valueOf(nDiasCesantia));
       
       double nDiasPromedioCesantia = 0;
       if ( nDiasCesantia >= 30 ){
           nDiasPromedioCesantia = (MesR * 30) + DiaR ;
           //JOptionPane.showMessageDialog(null, (nDiasPromedioCesantia * 30 / 360) , "Sql query", JOptionPane.INFORMATION_MESSAGE );
           nDiasPromedioCesantia = nDiasPromedioCesantia * 30 / 360;
       }
       jTextCesantiaDiasPromedio.setText(String.valueOf(miCesantiaDiasProporcionales.format(nDiasPromedioCesantia) ));
       
       
       nPromedio = (val1 + val2 + val3 + val4 + val5 + val6 );
       
       
       if ( nPromedio > 0 ){
           nPromedio = nPromedio / 6 ;
       } else {
           nPromedio = 0;
       }
       
       jTextSumaSueldo.setText(String.valueOf(  miFormato.format("%10.2f", nPromedio ) ));
       
       
       nPromedio1 = (val7 + val8 + val9 + val10 + val11 + val12 );
       
       
       if ( nPromedio1 > 0 ){
           nPromedio1 = nPromedio1 / 6 ;
       } else {
           nPromedio1 = 0;
       } 
          
       
        jTextSumaComision.setText(String.valueOf(  miFormato1.format("%10.2f", nPromedio1 ) ));
       
       
      nPromedio2 = (val13 + val14 + val15 + val16 + val17 + val18 );
       
       
       if ( nPromedio2 > 0 ){
           nPromedio2 = nPromedio2 / 6 ;
       } else {
           nPromedio2 = 0;
       } 
          
       
       jTextSumaHoraExtra.setText(String.valueOf(  miFormato2.format("%10.2f", nPromedio2 ) )); 
        
        
        
       nPromedio3 = Double.parseDouble(jTextSumaSueldo.getText());
       
       
       if ( nPromedio3 > 0 ){
           nPromedio3 = nPromedio3 ;
       } else {
           nPromedio3 = 0;
       }
       
       jTextSueldoOrdinarioMensual.setText(String.valueOf(  miFormato3.format("%10.2f", nPromedio3 ) ));
       
        nPromedio4 = Double.parseDouble(jTextSueldoOrdinarioMensual.getText()) +  Double.parseDouble(jTextSumaComision.getText());                   
 
             if ( nPromedio4 > 0 ){
           nPromedio4 = nPromedio4 * 1.166666 ;
           
       } else {
           nPromedio4 = 0;
       }
       
       jTextSueldoOrdinarioPromedioMensual.setText(String.valueOf(  miFormato4.format("%10.2f", nPromedio4 ) )); 
       
       nPromedio5 = Double.parseDouble(jTextSueldoOrdinarioPromedioMensual.getText()) +  Double.parseDouble(jTextSumaHoraExtra.getText());                   

       jTextSueldoPromedioMensual.setText(String.valueOf(  miFormato5.format("%10.2f", nPromedio5 ) ));  
       
       
       nPromedio6 = Double.parseDouble(jTextSueldoOrdinarioMensual.getText());                   
 
             if ( nPromedio6 > 0 ){
           nPromedio6 = nPromedio6 / 30 ;
           
       } else {
           nPromedio6 = 0;
       }
       
       jTextSueldoOrdinarioDiario.setText(String.valueOf(  miFormato6.format("%10.2f", nPromedio6 ) )); 
       
       nPromedio7 = Double.parseDouble(jTextSueldoOrdinarioPromedioMensual.getText());                   
 
             if ( nPromedio7 > 0 ){
           nPromedio7 = nPromedio7 / 30 ;
           
       } else {
           nPromedio7 = 0;
       }
       
       jTextSueldoOrdinarioPromedioDiario.setText(String.valueOf(  miFormato7.format("%10.2f", nPromedio7 ) )); 
       
       nPromedio8 = Double.parseDouble(jTextSueldoPromedioMensual.getText());                   
 
             if ( nPromedio8 > 0 ){
           nPromedio8 = nPromedio8 / 30 ;
           
       } else {
           nPromedio8 = 0;
       }
       
       jTextSueldoPromedioDiario.setText(String.valueOf(  miFormato8.format("%10.2f", nPromedio8 ) ));
       
       nPromedio9 = Double.parseDouble(jTextSueldoPromedioDiario.getText()) *  Double.parseDouble(jTextPreavisoDias.getText());                   
        
       jTextPreaviso.setText(String.valueOf(  miFormato9.format("%10.2f", nPromedio9 ) )); 
       
       nPromedio10 = Double.parseDouble(jTextAnios.getText()) * 30 ;                   
       
       nAuxilioCesantia = Double.parseDouble(jTextSueldoPromedioDiario.getText()) *  Double.parseDouble(jTextCesantiaDias.getText());
       nProporcionalAuxilioCesantia = Float.parseFloat(jTextSueldoPromedioDiario.getText()) * nDiasPromedioCesantia ;
       jTextAuxilioCesantia.setText(String.valueOf(  miFormato11.format("%10.2f", nAuxilioCesantia ) )); 
       jTextAuxilioCesantiaProporcional.setText(String.valueOf(  miCesantiaProporcional.format("%10.2f", nProporcionalAuxilioCesantia ) )); 
       
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextSueldo1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextSueldo1FocusLost
        // TODO add your handling code here:

        Formatter miFormato = new Formatter();
        double nValor = Double.parseDouble(jTextSueldo1.getText());
        jTextSueldo1.setText( String.valueOf( miFormato.format("%8.2f", nValor) ) );        
        
        jTextSueldo2.setText(jTextSueldo1.getText() ); 
        jTextSueldo3.setText(jTextSueldo1.getText() ); 
        jTextSueldo4.setText(jTextSueldo1.getText() ); 
        jTextSueldo5.setText(jTextSueldo1.getText() ); 
        jTextSueldo6.setText(jTextSueldo1.getText() ); 
       
        
    }//GEN-LAST:event_jTextSueldo1FocusLost

    private void jTextSueldo2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextSueldo2FocusLost
        // TODO add your handling code here:
        Formatter miFormato = new Formatter();
        double nValor = Double.parseDouble(jTextSueldo2.getText());
        jTextSueldo2.setText( String.valueOf( miFormato.format("%8.2f", nValor) ) );
    }//GEN-LAST:event_jTextSueldo2FocusLost

    private void jTextSueldo3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextSueldo3FocusLost
        // TODO add your handling code here:
        Formatter miFormato = new Formatter();
        double nValor = Double.parseDouble(jTextSueldo3.getText());
        jTextSueldo3.setText( String.valueOf( miFormato.format("%8.2f", nValor) ) );
    }//GEN-LAST:event_jTextSueldo3FocusLost

    private void jTextSueldo4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextSueldo4FocusLost
        // TODO add your handling code here:
        Formatter miFormato = new Formatter();
        double nValor = Double.parseDouble(jTextSueldo4.getText());
        jTextSueldo4.setText( String.valueOf( miFormato.format("%8.2f", nValor) ) );
    }//GEN-LAST:event_jTextSueldo4FocusLost

    private void jTextSueldo5FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextSueldo5FocusLost
        // TODO add your handling code here:
        Formatter miFormato = new Formatter();
        double nValor = Double.parseDouble(jTextSueldo5.getText());
        jTextSueldo5.setText( String.valueOf( miFormato.format("%8.2f", nValor) ) );
    }//GEN-LAST:event_jTextSueldo5FocusLost

    private void jTextSueldo6FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextSueldo6FocusLost
        // TODO add your handling code here:
        Formatter miFormato = new Formatter();
        double nValor = Double.parseDouble(jTextSueldo6.getText());
        jTextSueldo6.setText( String.valueOf( miFormato.format("%8.2f", nValor) ) );
    }//GEN-LAST:event_jTextSueldo6FocusLost

    private void jTextSueldo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSueldo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSueldo1ActionPerformed

    private void jTextSueldo4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSueldo4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextSueldo4ActionPerformed

    private void jTextSueldoOrdinarioMensualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextSueldoOrdinarioMensualActionPerformed
    
        
    }//GEN-LAST:event_jTextSueldoOrdinarioMensualActionPerformed

    private void jTextPreavisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextPreavisoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextPreavisoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculosPrestaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculosPrestaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculosPrestaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculosPrestaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculosPrestaciones().setVisible(true);
            }
        });
    }
    
/**
 * Permite convertir un String en fecha (Date). 
 * @param fecha (String) la fecha a la cual deseo convertir
 * @return Date la fecha en formato Date
 * @author Argenis R.
 */
 
public Date DeStringADate(String fecha){
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String strFecha = fecha;
        Date fechaDate = null;
        try {
            fechaDate = formato.parse(strFecha);
            //System.out.println(fechaDate.toString());
            return fechaDate;
        } catch (ParseException ex) {
            ex.printStackTrace();
            return fechaDate;
        }
    }      
    
public static int calcularDias(Date ini, Date fin) {
    Calendar cini = Calendar.getInstance();
    Calendar cfin = Calendar.getInstance();
    cini.setTime(ini);
    cfin.setTime(fin);
    
    int anios = cfin.get(Calendar.YEAR) - cini.get(Calendar.YEAR);
    int meses = cfin.get(Calendar.MARCH) - cini.get(Calendar.MARCH);
    int dia1=0, dia2=0;
    
    if (cini.get(Calendar.DATE)==31) {
        dia1=30;
    } else if (cini.get(Calendar.MARCH) == Calendar.FEBRUARY && cini.get(Calendar.DATE)>=28 ){
        dia1=30;
    }else {
        dia1=cini.get(Calendar.DATE);
    }
    
    if (cfin.get(Calendar.DATE)==31) {
        dia2=30;
    } else if (cfin.get(Calendar.MARCH) == Calendar.FEBRUARY && cfin.get(Calendar.DATE)>=28 ){  
        dia2=30;
    }else {
        dia2=cfin.get(Calendar.DATE);
    }
    
    int dias = dia2-dia1;
    int diasLab = (anios * 360) + (meses * 30)  + dias +1;
    
    return diasLab;
}

public class FullSelectorListener extends java.awt.event.FocusAdapter {
    public FullSelectorListener() {
    }
    @Override
    public void focusLost(java.awt.event.FocusEvent evt) {
    }
    @Override
    public void focusGained(java.awt.event.FocusEvent evt) {
        Object o = evt.getSource();
        if(o instanceof javax.swing.JTextField){
            javax.swing.JTextField txt = (javax.swing.JTextField) o;
            txt.setSelectionStart(0);
            txt.setSelectionEnd(txt.getText().length());
        }
    }
} 

public static int diasPreaviso( int nMeses) {
     
    
        String cWhere = String.valueOf(nMeses);
        String cSql;

        if(cWhere.length() > 0){
           cWhere = " WHERE " + cWhere + " BETWEEN mesesIni AND mesesFin    \n";
        }
        cSql = "SELECT dias \n" +
                "   FROM rh_preaviso  \n" +
                cWhere + "\n" +
                "ORDER BY dias DESC \n" + "  LIMIT 1; ;" ;

     //   JOptionPane.showMessageDialog(null,  "SQL = " + cSql, "Sql query", JOptionPane.INFORMATION_MESSAGE );
        
        Conectar nConexion = new Conectar();
        nConexion.conectar();
        Statement st = nConexion.conexion();
        ResultSet rs = nConexion.slqConsulta(st, cSql);
        int nDias = 0;
        
        try {
            while (rs.next()) {

                nDias = rs.getInt("dias");
            
                // aqui recuperamos los valores obtenidos y se los pasamos al jComboBix
        
            } // fin de while
        } catch (Exception eEc ){
            // Mostrar el error
            System.out.println("Error Sql " + eEc);
        }
        nConexion.cerrar(st);
        nConexion.desconectar();
        
        return nDias ;
    } // fin de diasPreaviso()
        
public static int diasCesantia( int nMeses) {
     
    
        String cWhere = String.valueOf(nMeses);
        String cSql;

        if(cWhere.length() > 0){
           cWhere = " WHERE " + cWhere + " BETWEEN mesesIni AND mesesFin    \n";
        }
        cSql = "SELECT dias \n" +
                "   FROM rh_cesantia  \n" +
                cWhere + "\n" +
                "ORDER BY dias DESC \n" + "  LIMIT 1; ;" ;

     //   JOptionPane.showMessageDialog(null,  "SQL = " + cSql, "Sql query", JOptionPane.INFORMATION_MESSAGE );
        
        Conectar nConexion = new Conectar();
        nConexion.conectar();
        Statement st = nConexion.conexion();
        ResultSet rs = nConexion.slqConsulta(st, cSql);
        int nDias = 0;
        
        try {
            while (rs.next()) {

                nDias = rs.getInt("dias");
                
                if (nDias == 30){
                    nDias = 30 * (nMeses / 12);
                } // fin de if
                
                
                // aqui recuperamos los valores obtenidos y se los pasamos al jComboBix
        
            } // fin de while
        } catch (Exception eEc ){
            // Mostrar el error
            System.out.println("Error Sql " + eEc);
        }
        nConexion.cerrar(st);
        nConexion.desconectar();
        
        return nDias ;
    } // fin de diasPreaviso()


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField jTextAguinaldo;
    private javax.swing.JTextField jTextAguinaldoProporcional;
    private javax.swing.JTextField jTextAnios;
    private javax.swing.JTextField jTextAuxilioCesantia;
    private javax.swing.JTextField jTextAuxilioCesantiaProporcional;
    private javax.swing.JTextField jTextCesantiaDias;
    private javax.swing.JTextField jTextCesantiaDiasPromedio;
    private javax.swing.JTextField jTextComision1;
    private javax.swing.JTextField jTextComision2;
    private javax.swing.JTextField jTextComision3;
    private javax.swing.JTextField jTextComision4;
    private javax.swing.JTextField jTextComision5;
    private javax.swing.JTextField jTextComision6;
    private javax.swing.JTextField jTextDecimoCuartoMes;
    private javax.swing.JTextField jTextDecimoCuartoMesProporcional;
    private javax.swing.JTextField jTextDias;
    private javax.swing.JTextField jTextDiasProporcionales;
    private javax.swing.JTextField jTextFechaE;
    private javax.swing.JTextField jTextFechaI;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField31;
    private javax.swing.JTextField jTextField32;
    private javax.swing.JTextField jTextField33;
    private javax.swing.JTextField jTextField34;
    private javax.swing.JTextField jTextField35;
    private javax.swing.JTextField jTextField36;
    private javax.swing.JTextField jTextField37;
    private javax.swing.JTextField jTextField38;
    private javax.swing.JTextField jTextField39;
    private javax.swing.JTextField jTextField50;
    private javax.swing.JTextField jTextField54;
    private javax.swing.JTextField jTextField55;
    private javax.swing.JTextField jTextField56;
    private javax.swing.JTextField jTextField57;
    private javax.swing.JTextField jTextField58;
    private javax.swing.JTextField jTextField59;
    private javax.swing.JTextField jTextField60;
    private javax.swing.JTextField jTextField61;
    private javax.swing.JTextField jTextField62;
    private javax.swing.JTextField jTextField63;
    private javax.swing.JTextField jTextField64;
    private javax.swing.JTextField jTextField66;
    private javax.swing.JTextField jTextField74;
    private javax.swing.JTextField jTextField75;
    private javax.swing.JTextField jTextField76;
    private javax.swing.JTextField jTextField77;
    private javax.swing.JTextField jTextField78;
    private javax.swing.JTextField jTextHoraExtra1;
    private javax.swing.JTextField jTextHoraExtra2;
    private javax.swing.JTextField jTextHoraExtra3;
    private javax.swing.JTextField jTextHoraExtra4;
    private javax.swing.JTextField jTextHoraExtra5;
    private javax.swing.JTextField jTextHoraExtra6;
    private javax.swing.JTextField jTextIdentidad;
    private javax.swing.JTextField jTextMeses;
    private javax.swing.JTextField jTextNombre;
    private javax.swing.JTextField jTextPreaviso;
    private javax.swing.JTextField jTextPreavisoDias;
    private javax.swing.JTextField jTextPuesto;
    private javax.swing.JTextField jTextSueldo1;
    private javax.swing.JTextField jTextSueldo2;
    private javax.swing.JTextField jTextSueldo3;
    private javax.swing.JTextField jTextSueldo4;
    private javax.swing.JTextField jTextSueldo5;
    private javax.swing.JTextField jTextSueldo6;
    private javax.swing.JTextField jTextSueldoOrdinarioDiario;
    private javax.swing.JTextField jTextSueldoOrdinarioMensual;
    private javax.swing.JTextField jTextSueldoOrdinarioPromedioDiario;
    private javax.swing.JTextField jTextSueldoOrdinarioPromedioMensual;
    private javax.swing.JTextField jTextSueldoPromedioDiario;
    private javax.swing.JTextField jTextSueldoPromedioMensual;
    private javax.swing.JTextField jTextSumaComision;
    private javax.swing.JTextField jTextSumaHoraExtra;
    private javax.swing.JTextField jTextSumaSueldo;
    private javax.swing.JTextField jTextTotal;
    private javax.swing.JTextField jTextTotalDias;
    private javax.swing.JTextField jTextVacaciones1;
    private javax.swing.JTextField jTextVacaciones2;
    private javax.swing.JTextField jTextVacaciones3;
    private javax.swing.JTextField jTextVacaciones4;
    private javax.swing.JTextField jTextVacacionesProporcionales;
    private javax.swing.JTextField jTextZona;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
