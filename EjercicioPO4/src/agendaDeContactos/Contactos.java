package agendaDeContactos;

import javax.swing.*;
import java.util.*;

public class Contactos {
    private List<String> nombres;
    private List<String> numerosTelefono;
    private List<String> emails;
    private JPanel panel1;
    private JButton salirButton;
    private JButton mostrarContactoButton;
    private JButton eliminarContactoButton;
    private JButton anadirContactoButton;
    private JLabel Contactos;

    public Contactos() {
        this.nombres = new ArrayList<>();
        this.numerosTelefono = new ArrayList<>();
        this.emails = new ArrayList<>();

        salirButton.addActionListener(this::setSalirButton);
        anadirContactoButton.addActionListener(this::conseguir_Datos);
        eliminarContactoButton.addActionListener(this::eliminarContacto);
        mostrarContactoButton.addActionListener(this::mostrarContactos);
    }

    private static HashMap<String, Contactos> contactosMap = new HashMap<>();

    public void setSalirButton(java.awt.event.ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Hasta luego buena suerte");
        System.exit(3);
    }

    public void conseguir_Datos(java.awt.event.ActionEvent e) {
        Contactos nuevoContacto = new Contactos();

        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        nuevoContacto.getNombres().add(nombre);

        String numTelefono = JOptionPane.showInputDialog("Ingresa su numero de telefono");
        while (!(numTelefono != null && numTelefono.matches("^\\+34\\d{9}$"))) {
            numTelefono = JOptionPane.showInputDialog("Ingresa un numero correcto");
        }
        nuevoContacto.getNumerosTelefono().add(numTelefono);

        String email = JOptionPane.showInputDialog("Ingrese su email");
        while (!(email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$"))) {
            email = JOptionPane.showInputDialog("Ingrese su email valido");
        }
        nuevoContacto.getEmails().add(email);


        contactosMap.put(numTelefono, nuevoContacto);
    }

    public void eliminarContacto(java.awt.event.ActionEvent e) {

        mostrarContactos(null);

        String numTelefonoEliminar = JOptionPane.showInputDialog("Ingrese el número de teléfono del contacto que desea eliminar:");

        if (contactosMap.containsKey(numTelefonoEliminar)) {
            contactosMap.remove(numTelefonoEliminar);
            JOptionPane.showMessageDialog(null, "Contacto eliminado con exito");
        } else {
            JOptionPane.showMessageDialog(null,"El contacto no existe en la agenda");
        }
    }

    public List<String> getNombres() {
        return nombres;
    }

    public List<String> getNumerosTelefono() {
        return numerosTelefono;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void mostrarContactos(java.awt.event.ActionEvent e) {
        StringBuilder mensaje = new StringBuilder("Lista de Contactos:\n");

        for (Map.Entry<String, Contactos> entry : contactosMap.entrySet()) {
            Contactos contacto = entry.getValue();
            mensaje.append("Nombre: ").append(contacto.getNombres())
                    .append(", Números de Teléfono: ").append(contacto.getNumerosTelefono())
                    .append(", Email : ").append(contacto.getEmails())
                    .append("\n");
        }

        JOptionPane.showMessageDialog(null, mensaje.toString(), "Lista de Contactos", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Contactos().mostrarInterfaz());
    }

    public void mostrarInterfaz() {
        JFrame frame = new JFrame("Contactos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new Contactos().panel1);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

}

