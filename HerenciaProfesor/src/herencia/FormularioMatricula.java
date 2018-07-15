package herencia;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FormularioMatricula extends javax.swing.JFrame {
    String [][] materias;
    String [][] profesores;
    String [][] estudiantes;
    String [][] esMatriculados;
    DefaultTableModel tblModelMaterias;
    DefaultTableModel tblModelProfesores;
    DefaultTableModel tblModelEstudiantes;
    DefaultTableModel tblModelEsMatriculados;
    
    List<Materia> listaMaterias = new ArrayList<Materia>();
    DefaultComboBoxModel listaMateriasModel = new DefaultComboBoxModel(listaMaterias.toArray());
    
    List<Profesor> listaProfesores = new ArrayList<Profesor>();
    DefaultComboBoxModel listaProfesoresModel = new DefaultComboBoxModel(listaProfesores.toArray());
    
    List<Estudiante> listaEstudiantes = new ArrayList<Estudiante>();
    DefaultComboBoxModel listaEstudiantesModel = new DefaultComboBoxModel(listaEstudiantes.toArray());
    
    List<Estudiante> listaEsMatriculados = new ArrayList<Estudiante>();
    DefaultComboBoxModel listaEsMatriModel = new DefaultComboBoxModel(listaEsMatriculados.toArray());
    
    int contador =0;
    
    public FormularioMatricula() {
        initComponents();
        
        this.getContentPane().setBackground(Color.white);
        Materia m = new Materia ("");
        
         String titulosColumnasMaterias [] = new String []{
            "Nombre"       
        };
        tblModelMaterias = new DefaultTableModel(materias, titulosColumnasMaterias);
        tblRegistroMa.setModel(tblModelMaterias);
        
        cmbListaMaterias.setModel(listaMateriasModel);
        
        
        String titulosColumnasProfesores [] = new String []{
        "Nombre", "Apellido", "Facultad", "Materia"
        };
        tblModelProfesores = new DefaultTableModel(profesores, titulosColumnasProfesores);
        tblCargoEspecifico.setModel(tblModelProfesores);
        
        
        String titulosColumnasEstudiantes [] = new String []{
        "Nombre", "Apellido", "Edad"
        };
        tblModelEstudiantes = new DefaultTableModel(estudiantes, titulosColumnasEstudiantes);
        tblRegistroEs.setModel(tblModelEstudiantes);
        
        cmbListaEstudiantes.setModel(listaEstudiantesModel);
        
        String titulosColumnasEsMatriculados [] = new String []{
        " ", "Estudiante", "Materia"
        };
        tblModelEsMatriculados = new DefaultTableModel(esMatriculados, titulosColumnasEsMatriculados);
        tblEsMatriculados.setModel(tblModelEsMatriculados);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombreMa = new javax.swing.JTextField();
        lblTitulo = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRegistroMa = new javax.swing.JTable();
        btnRegistrarMa = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        lblNombrePro = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCargoEspecifico = new javax.swing.JTable();
        cmbListaMaterias = new javax.swing.JComboBox<>();
        lblApellidoPro = new javax.swing.JLabel();
        lblFacultad = new javax.swing.JLabel();
        lblMateriaPro = new javax.swing.JLabel();
        txtNombrePro = new javax.swing.JTextField();
        txtApellidoPro = new javax.swing.JTextField();
        txtFacultad = new javax.swing.JTextField();
        btnRegistrarEm = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        lblNombreEs = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblRegistroEs = new javax.swing.JTable();
        lblApellidoEs = new javax.swing.JLabel();
        lblEdadEs = new javax.swing.JLabel();
        txtNombreEs = new javax.swing.JTextField();
        txtApellidoEs = new javax.swing.JTextField();
        txtEdadEs = new javax.swing.JTextField();
        btnRegistrarEs = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btnMatricularEs = new javax.swing.JButton();
        lblEstudiante = new javax.swing.JLabel();
        lblMateria = new javax.swing.JLabel();
        cmbListaEstudiantes = new javax.swing.JComboBox<>();
        cmbMateriasDis = new javax.swing.JComboBox<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblEsMatriculados = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblNombre.setText("Nombre:");

        txtNombreMa.setText("iNGLES");
        txtNombreMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreMaActionPerformed(evt);
            }
        });

        lblTitulo.setText("Materia");

        tblRegistroMa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblRegistroMa);

        btnRegistrarMa.setText("Registrar");
        btnRegistrarMa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarMaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtNombreMa, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(152, 152, 152))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(192, 192, 192))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31))))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(btnRegistrarMa)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombre)
                    .addComponent(txtNombreMa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(btnRegistrarMa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        jTabbedPane1.addTab("Materia", jPanel4);

        lblNombrePro.setText("Nombre:");

        tblCargoEspecifico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblCargoEspecifico);

        cmbListaMaterias.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        cmbListaMaterias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbListaMateriasItemStateChanged(evt);
            }
        });

        lblApellidoPro.setText("Apellido:");

        lblFacultad.setText("Facultad:");

        lblMateriaPro.setText("Materia:");

        txtNombrePro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreProActionPerformed(evt);
            }
        });

        txtApellidoPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoProActionPerformed(evt);
            }
        });

        txtFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFacultadActionPerformed(evt);
            }
        });

        btnRegistrarEm.setText("Registrar");
        btnRegistrarEm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblApellidoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtApellidoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(lblFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(lblMateriaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarEm)
                .addGap(57, 57, 57))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombrePro)
                    .addComponent(txtNombrePro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoPro)
                    .addComponent(txtApellidoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFacultad)
                    .addComponent(txtFacultad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblMateriaPro)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cmbListaMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnRegistrarEm)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        jTabbedPane1.addTab("Profesor", jPanel5);

        lblNombreEs.setText("Nombre:");

        tblRegistroEs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tblRegistroEs);

        lblApellidoEs.setText("Apellido:");

        lblEdadEs.setText("Edad:");

        txtNombreEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEsActionPerformed(evt);
            }
        });

        txtApellidoEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoEsActionPerformed(evt);
            }
        });

        txtEdadEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEdadEsActionPerformed(evt);
            }
        });

        btnRegistrarEs.setText("Registrar");
        btnRegistrarEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarEsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblNombreEs, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNombreEs, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblApellidoEs, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellidoEs, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel6Layout.createSequentialGroup()
                                .addComponent(lblEdadEs, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtEdadEs, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnRegistrarEs)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNombreEs)
                    .addComponent(txtNombreEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblApellidoEs)
                    .addComponent(txtApellidoEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEdadEs)
                    .addComponent(txtEdadEs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnRegistrarEs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 469, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 332, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Estudiante", jPanel1);

        btnMatricularEs.setText("Matricular");
        btnMatricularEs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMatricularEsActionPerformed(evt);
            }
        });

        lblEstudiante.setText("Estudiante:");

        lblMateria.setText("Materia:");

        tblEsMatriculados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tblEsMatriculados);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEstudiante)
                    .addComponent(lblMateria))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cmbListaEstudiantes, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbMateriasDis, 0, 112, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnMatricularEs))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEstudiante)
                    .addComponent(cmbListaEstudiantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMateria)
                    .addComponent(cmbMateriasDis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(btnMatricularEs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        jTabbedPane1.addTab("Matricula", jPanel7);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFacultadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFacultadActionPerformed

    private void txtApellidoProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoProActionPerformed

    private void txtNombreProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreProActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreProActionPerformed

    private void cmbListaMateriasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbListaMateriasItemStateChanged

    }//GEN-LAST:event_cmbListaMateriasItemStateChanged

    private void txtNombreMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreMaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMaActionPerformed

    private void txtNombreEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreEsActionPerformed

    private void txtApellidoEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoEsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoEsActionPerformed

    private void txtEdadEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEdadEsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEdadEsActionPerformed

    private void btnRegistrarMaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarMaActionPerformed
        
        String nombre = txtNombreMa.getText();
        boolean materiaExiste = false;

        Materia newMateria = new Materia (nombre);

        if (!nombre.equals("")){
            int confirmacion= JOptionPane.showConfirmDialog(rootPane, "Estas seguro?","Confirmación",JOptionPane.YES_NO_OPTION);
            if(confirmacion ==0){
                for (Materia e : listaMaterias){
                    if (e.getNombre().equals(newMateria.getNombre())){
                        materiaExiste =true;
                        break;
                    }
                }
                if (!materiaExiste){
                    listaMaterias.add(newMateria);

                    tblModelMaterias.addRow(new String [] {newMateria.getNombre()});

                    cmbListaMaterias.addItem(txtNombreMa.getText());
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Ya esta registrado");

                }
                txtNombreMa.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Por favor ingrese todos los campos");
        }
    }//GEN-LAST:event_btnRegistrarMaActionPerformed

    private void btnRegistrarEmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEmActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombrePro.getText();
        String apellido = txtApellidoPro.getText();
        String facultad = txtFacultad.getText();
        String materia =  cmbListaMaterias.getSelectedItem().toString();

        Profesor newProfesor = new Profesor (nombre, apellido, facultad, materia);

        boolean profesorExiste = false;

        if (!nombre.equals("")&& !apellido.equals("")&& !facultad.equals("") && !materia.equals("")){
            int confirmacion= JOptionPane.showConfirmDialog(rootPane, "Estás seguro?","Confirmación",JOptionPane.YES_NO_OPTION);
            if(confirmacion ==0){
                for (Profesor p : listaProfesores){
                    if (p.getMateria().equals(newProfesor.getMateria())){
                        profesorExiste =true;
                        break;
                    }
                }
                if (!profesorExiste){
                    listaProfesores.add(newProfesor);

                    tblModelProfesores.addRow(new String [] {newProfesor.getNombre(), newProfesor.getApellido(), newProfesor.getFacultad(), newProfesor.getMateria()});
                    cmbMateriasDis.addItem(materia);
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Materia ya registrada!!");

                }
                txtNombrePro.setText("");
                txtApellidoPro.setText("");
                txtFacultad.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Por favor ingrese todos los campos");
        }
    }//GEN-LAST:event_btnRegistrarEmActionPerformed

    private void btnRegistrarEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarEsActionPerformed
        // TODO add your handling code here:
        String nombreEs = txtNombreEs.getText();
        String apellidoEs = txtApellidoEs.getText();
        String edadEs = txtEdadEs.getText();
        int edad = Integer.parseInt(edadEs);
        
        Estudiante newEstudiante = new Estudiante (nombreEs, apellidoEs, edad);

        if (!nombreEs.equals("")&& !apellidoEs.equals("")&& !edadEs.equals("")){
            int confirmacion= JOptionPane.showConfirmDialog(rootPane, "Estás seguro?","Confirmación",JOptionPane.YES_NO_OPTION);
            if(confirmacion ==0){
                listaEstudiantes.add(newEstudiante);

                tblModelEstudiantes.addRow(new String [] {newEstudiante.getNombre(), newEstudiante.getApellido(), edadEs});
                cmbListaEstudiantes.addItem(nombreEs+" "+apellidoEs);
                txtNombreEs.setText("");
                txtApellidoEs.setText("");
                txtEdadEs.setText("");
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Por favor ingrese todos los campos");
        }
        
    }//GEN-LAST:event_btnRegistrarEsActionPerformed

    private void btnMatricularEsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMatricularEsActionPerformed
        // TODO add your handling code here:
        String esMatriculado =  cmbListaEstudiantes.getSelectedItem().toString();
        String materiaSelec =  cmbMateriasDis.getSelectedItem().toString();
        
        boolean matriculaExiste = false;
        
        Estudiante newEsMatriculado = new Estudiante (esMatriculado, materiaSelec);

        if (!esMatriculado.equals("")&& !materiaSelec.equals("")){
            int confirmacion= JOptionPane.showConfirmDialog(rootPane, "Estás seguro?","Confirmación",JOptionPane.YES_NO_OPTION);
            if(confirmacion ==0){
                
                //Utilizo un bucle for para comparar si los valores ingresados ya estan registrados en la tabla.
                for (int i = 0; i < tblModelEsMatriculados.getRowCount(); i++) {
                    if (esMatriculado  == tblModelEsMatriculados.getValueAt(i, 1).toString().trim() && materiaSelec== tblModelEsMatriculados.getValueAt(i, 2).toString().trim() ){
                        matriculaExiste =true;
                        break;
                    }
                    
                }   
                if (!matriculaExiste){
                    listaEsMatriculados.add(newEsMatriculado);
                    contador++;
                    String stringCont = String.valueOf(contador);
                    tblModelEsMatriculados.addRow(new String [] {stringCont, esMatriculado, materiaSelec});
                }else{
                    JOptionPane.showMessageDialog(rootPane, "El estudiante ya esta matriculado en esta materia");

                }
            }
        }
        else{
            JOptionPane.showMessageDialog(rootPane,"Por favor ingrese todos los campos");
        }
        
    }//GEN-LAST:event_btnMatricularEsActionPerformed

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
            java.util.logging.Logger.getLogger(FormularioMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormularioMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormularioMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormularioMatricula.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormularioMatricula().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMatricularEs;
    private javax.swing.JButton btnRegistrarEm;
    private javax.swing.JButton btnRegistrarEs;
    private javax.swing.JButton btnRegistrarMa;
    private javax.swing.JComboBox<String> cmbListaEstudiantes;
    private javax.swing.JComboBox<String> cmbListaMaterias;
    private javax.swing.JComboBox<String> cmbMateriasDis;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblApellidoEs;
    private javax.swing.JLabel lblApellidoPro;
    private javax.swing.JLabel lblEdadEs;
    private javax.swing.JLabel lblEstudiante;
    private javax.swing.JLabel lblFacultad;
    private javax.swing.JLabel lblMateria;
    private javax.swing.JLabel lblMateriaPro;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNombreEs;
    private javax.swing.JLabel lblNombrePro;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tblCargoEspecifico;
    private javax.swing.JTable tblEsMatriculados;
    private javax.swing.JTable tblRegistroEs;
    private javax.swing.JTable tblRegistroMa;
    private javax.swing.JTextField txtApellidoEs;
    private javax.swing.JTextField txtApellidoPro;
    private javax.swing.JTextField txtEdadEs;
    private javax.swing.JTextField txtFacultad;
    private javax.swing.JTextField txtNombreEs;
    private javax.swing.JTextField txtNombreMa;
    private javax.swing.JTextField txtNombrePro;
    // End of variables declaration//GEN-END:variables
}
