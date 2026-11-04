package dominio;

public class t_Variante {
    private int id;
    private String talla;
    private String color;
    private int stock;
    private int stockApartado;
    private int umbralPocasPiezas;
    private boolean visibilidad;

    public t_Variante(int id, String talla, String color, int stock, int stockApartado,
                      int umbralPocasPiezas, boolean visibilidad) {
        this.id = id;
        this.talla = talla;
        this.color = color;
        this.stock = stock;
        this.stockApartado = stockApartado;
        this.umbralPocasPiezas = umbralPocasPiezas;
        this.visibilidad = visibilidad;
    }

    /** Resta piezas del stock. */
    public void retirarStock(int idVariante, int cantidad) {
        verificar(idVariante, cantidad);
        if (cantidad > stock - stockApartado)
            throw new IllegalArgumentException("Stock disponible insuficiente.");
        stock -= cantidad;
    }

    /** Suma piezas al stock apartado. */
    public void apartarStock(int idVariante, int cantidad) {
        verificar(idVariante, cantidad);
        if (cantidad > stock - stockApartado)
            throw new IllegalArgumentException("Stock disponible insuficiente.");
        stockApartado += cantidad;
    }

    /** Resta piezas del stock apartado. */
    public void liberarStock(int idVariante, int cantidad) {
        verificar(idVariante, cantidad);
        if (cantidad > stockApartado)
            throw new IllegalArgumentException("No hay tantas piezas apartadas.");
        stockApartado -= cantidad;
    }

    private void verificar(int idVariante, int cantidad) {
        if (idVariante != this.id)
            throw new IllegalArgumentException("El id no corresponde a esta variante.");
        if (cantidad <= 0)
            throw new IllegalArgumentException("La cantidad debe ser mayor a cero.");
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getTalla() { return talla; }
    public void setTalla(String talla) { this.talla = talla; }

    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public int getStockApartado() { return stockApartado; }
    public void setStockApartado(int stockApartado) { this.stockApartado = stockApartado; }

    public int getUmbralPocasPiezas() { return umbralPocasPiezas; }
    public void setUmbralPocasPiezas(int umbralPocasPiezas) { this.umbralPocasPiezas = umbralPocasPiezas; }

    public boolean isVisibilidad() { return visibilidad; }
    public void setVisibilidad(boolean visibilidad) { this.visibilidad = visibilidad; }
}
