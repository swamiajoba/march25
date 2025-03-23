import { Observable } from "rxjs";

export function fetchLetters() {
    return new Observable<string[]>(sub => {
      const t = setTimeout(() => {
        sub.next(['a', 'b', 'c']);
        sub.complete();
        clearTimeout(t);
      }, 1000)
    })
  }
  