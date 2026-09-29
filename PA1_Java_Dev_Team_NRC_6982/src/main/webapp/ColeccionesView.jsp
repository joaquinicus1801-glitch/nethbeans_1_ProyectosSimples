
<%@page contentType="text/html" pageEncoding="UTF-8"%> <!-- es para tener listo una plantilla -->
<%@include file="WEB-INF/Template/header.jsp" %>
<div class="container-fluid">
    <div class="d-flex justify-content-center">
        <div class="row">
            <form action="PlantillaController" method="GET">
                <h5>Plantilla</h5>
                <br/>
                <button class="btn btn-danger" type="submit">Enviar</button>
                <br/>
                <label class="form-label"></label>
            </form>
        </div>
    </div>
</div>
<!-- Una interface define un conjunto de operaciones que caracterza el comportamiento de un objeto 
y deben ser codificadas en las clases que implementa la interfa, en palabras simples por asi decirlo contiene 
  los metodos de los objetos creados, pero relaxionados?
  la interfaz es un coleccion de metodos abstractos y  propiedadaes constantes
  la interfaz volar
    public interface inVolar{
    public void volar();
    public void acelerar();
    public void  aterrizar():
  }
  esta interface delcara todos los objetos que tienen la capacidad de volar
-->
<!--Las colecciones son un tipo de conjunto de datos en java son los jcf
  collection, list, set, sortedSet, Queue, Iterator, listIterator, Comparable, Comparator
-->
<%@include file="WEB-INF/Template/FooterView.jsp" %>