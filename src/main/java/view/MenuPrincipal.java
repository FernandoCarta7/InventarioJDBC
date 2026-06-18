package view;

import entity.Producto;
import service.ProductoService;
import util.InputUtil;

public class MenuPrincipal {



    private final ProductoService service = new ProductoService();

    public void start() {

        while (true) {
            System.out.println("\n=== SISTEMA INVENTARIO ===");
            System.out.println("1. Crear producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Salir");

            int option = InputUtil.readInt("Opción: ");

            switch (option) {
                case 1 -> crear();
                case 2 -> listar();
                case 3 -> eliminar();
                case 4 -> System.exit(0);
            }
        }
    }

    private void crear() {
        String nombre = InputUtil.readString("Nombre: ");
        int cantidad = InputUtil.readInt("Cantidad: ");
        double precio = InputUtil.readDouble("Precio: ");
        long catId = InputUtil.readLong("Categoria ID: ");

        service.crear(new Producto(nombre, cantidad, precio, catId));
    }

    private void listar() {
        service.listar().forEach(p ->
                System.out.println(p.getIdProducto() + " - " + p.getNombre())
        );
    }

    private void eliminar() {
        long id = InputUtil.readLong("ID: ");
        service.eliminar(id);
    }






}
