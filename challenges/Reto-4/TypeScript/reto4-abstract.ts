/*
 * Reto #4
 * ÁREA DE UN POLÍGONO
 * Fecha publicación enunciado: 24/01/22
 * Fecha publicación resolución: 31/01/22
 * Dificultad: FÁCIL
 *
 * Enunciado: Crea UNA ÚNICA FUNCIÓN (importante que sólo sea una) que sea capaz de calcular y retornar el área de un polígono.
 * - La función recibirá por parámetro sólo UN polígono a la vez.
 * - Los polígonos soportados serán Triángulo, Cuadrado y Rectángulo.
 * - Imprime el cálculo del área de un polígono de cada tipo.
 *
 * Información adicional:
 * - Usa el canal de nuestro discord (https://mouredev.com/discord) "🔁reto-semanal" para preguntas, dudas o prestar ayuda a la acomunidad.
 * - Puedes hacer un Fork del repo y una Pull Request al repo original para que veamos tu solución aportada.
 * - Revisaré el ejercicio en directo desde Twitch el lunes siguiente al de su publicación.
 * - Subiré una posible solución al ejercicio el lunes siguiente al de su publicación.
 *
 */

abstract class PolygonAbstract {
  constructor(protected namePolygon: string) {}

  public abstract get area(): number;

  public printArea(): void {
    console.log(`El área del ${this.namePolygon} es: ${this.area}.`);
  }
}

class TriangleAbstract extends PolygonAbstract {
  constructor(private base: number, private height: number) {
    super('triángulo');
  }

  public get area(): number {
    return (this.base * this.height) / 2;
  }
}

class RectangleAbstract extends PolygonAbstract {
  constructor(private base: number, private height: number) {
    super('rectángulo');
  }

  public get area(): number {
    return this.base * this.height;
  }
}

class SquareAbstract extends PolygonAbstract {
  constructor(private side: number) {
    super('cuadrado');
  }

  public get area(): number {
    return this.side * this.side;
  }
}

const polygonsAbstract = [
  new TriangleAbstract(3, 7),
  new RectangleAbstract(8, 4),
  new SquareAbstract(5),
];

polygonsAbstract.forEach((polygon) => polygon.printArea());
