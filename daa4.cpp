#include<iostream>
#include<vector>

using namespace std;

int ksackProblem(int n, int m , vector<vector<int>>&items){
      vector<vector<int>>T(n+1,vector<int>(m+1,0));

      for(int i=1;i<=n;i++){
        int profit = items[i-1][0];
        int weight = items[i-1][1];

        for(int j=1;j<=m;j++){
            if(weight <= j){
                T[i][j]= max(T[i-1][j],T[i-1][j-weight]+profit);
            }
            else{
                T[i][j]=T[i-1][j];
            }
        }
      }
      return T[n][m];
}
int main(){
    int n;
    cout<<"Enter the number of Objects : ";
    cin>>n;

    int m;
    cout<<"Enter the knapsack capacity : ";
    cin>>m;

    vector<vector<int>>items(n,vector<int>(2));

    cout<<"Enter the profit and weights for knapsack : ";
    for(int i=0;i<n;i++){
        cin>>items[i][0]>>items[i][1];
    }

    int maxProfit = ksackProblem(n,m,items);
    cout<<"Maximum Profit : "<<maxProfit;

    return 0;
}

// Output - 
// Enter the number of Objects : 4
// Enter the knapsack capacity : 5
// Enter the profit and weights for knapsack : 
// 6 1 
// 5 2
// 3 1
// 8 2
// Maximum Profit : 19