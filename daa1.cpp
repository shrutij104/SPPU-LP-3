// Recursive Fibonaaci

#include<iostream>
using namespace std;
int fib(int n){
    if(n<=1){
        return n;
    }
    return fib(n-2)+fib(n-1);
}
int main(){
    int n;
    cout<<"Enter the Number : ";
    cin>>n;
    for(int i=0;i<n;i++){
        cout<<fib(i)<<" ";
    }
    return 0;
}


//Iterative Fibonaaci

#include<iostream>
using namespace std;

int fib(int n){
    int t0 = 0;
    int t1 = 1;
    int s;
    if(n<=1){
        return n;
    }
    for(int i=0;i<n;i++){
        cout<<t0<<" ";
        s = t0 + t1;
        t0 = t1;
        t1 = s;
    }
}
int main(){
    int n;
    cout<<"Enter the Number : ";
    cin>>n;
    fib(n);
    return 0;
}