
import http from 'k6/http';

export default function () {
  http.get('http://localhost:8080/objetivos');
  http.get('http://localhost:8080/indicador/3.1.1');
  http.get('http://localhost:8080/indicador/3.9.3');
  http.get('http://localhost:8080/indicador/3.8.2');
}

