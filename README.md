# DSA

- First ever algorithm Euclid algo

to find the greatest common factor

E1 - find reminder
E2 - is it zero 
E3 - reduce (m = n, rem = n)

```mermaid
graph LR;
E1 --> E2{is};
End == yes === E2;
E2 --no--> E3;
E3 --> E1;


```