import {createStore} from 'redux';

const store = createStore(reducer);//set the reducers for the stor

//reducer:perfoms the state,updates the state

function reducer(state={amount:1000},action){
    return state
}
console.log(store.getState());//getting the value of a state

 