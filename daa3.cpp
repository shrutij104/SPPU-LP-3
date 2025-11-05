#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;
float fractionalKnapsack(vector<vector<float>>&items , float capacity){
    int n = items.size();
    for(int i=0; i<n;i++){
        items[i][2]= items[i][0]/items[i][1];
    }

    sort(items.begin(),items.end(),[](vector<float>&a,vector<float>&b){
              return a[2]>b[2];
    });
    float totalProfit = 0.0;
    for(int i=0;i<n;i++){
        if(capacity>=items[i][1]){
            totalProfit += items[i][0];
            capacity -= items[i][1];
        }
        else{
            totalProfit += items[i][2] * capacity;
            break;
        }
    }
    return totalProfit;
}
int main(){
    int n;
    cout<<"Enter the number of Objects : ";
    cin>>n;

    float capacity;
    cout<<"Enter the knapsack capacity : ";
    cin>>capacity;

    vector<vector<float>>items(n,vector<float>(3));
    
    cout << "Enter profit and weight of each item:\n";
    for(int i=0;i<n;i++){
        cin>>items[i][0]>>items[i][1];
    }

    double maxProfit = fractionalKnapsack(items,capacity);
    cout<<"MaxProfit : "<<maxProfit;
    return 0;
}

// output - 
// Enter the number of Objects : 7
// Enter the knapsack capacity : 15
// Enter profit and weight of each item:
// 12 2
// 17 5
// 9 7
// 7 3
// 5 1
// 21 4
// 8 1
// MaxProfit : 67.6667