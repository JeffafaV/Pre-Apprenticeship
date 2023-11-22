import React from 'react';
import ReactDOM from 'react-dom';

const stateInfo = (state1, capital1, state2, population2, capital2, state3, population3, capital3) => {
    return (
        <table>
            <tbody>
                <tr>
                    <th>State</th>
                    <th>Population</th>
                    <th>Capital</th>
                </tr>
                <tr>
                    <td>{state1}</td>
                    <td></td>
                    <td>{capital1}</td>
                </tr>
                <tr>
                    <td>{state2}</td>
                    <td>{population2}</td>
                    <td>{capital2}</td>
                </tr>
                <tr>
                    <td>{state3}</td>
                    <td>{population3}</td>
                    <td>{capital3}</td>
                </tr>
            </tbody>
        </table>
    );
}

ReactDOM.render(
    stateInfo('Idaho', 'Boise', 'Tennessee', '6.651 million', 'Nashville', 'Maine', '1.331 million', 'Agusta', 'Wisconsin', '5.779 million', 'Madison'),
    document.getElementById('root')
);