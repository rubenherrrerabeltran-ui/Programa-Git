// Programa de ejemplo: calcula el total de un pedido con IVA
fun main() {
    val subtotal = 150000.0
    val iva = subtotal * 0.19
    println("Subtotal: $subtotal  IVA: $iva  Total: ${subtotal + iva}")
}
