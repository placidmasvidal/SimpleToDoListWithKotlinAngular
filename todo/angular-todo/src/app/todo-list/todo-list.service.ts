import { HttpClient, HttpResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Todo } from '../models/Todo';

@Injectable()
export class TodoListService {

  private resourceUrl = 'http://localhost:8000/todos';

  constructor(private http: HttpClient) { }

  create(todo: Todo): Observable<Todo> {

  }

  private convert(todo: Todo): Todo {
    const copy: Todo = Object.assign({}, todo);
    return copy;
  }
}
