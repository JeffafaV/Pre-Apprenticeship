import React from 'react';
import ReactDOM from 'react-dom';

const App = props => {
  return <BankAccount />;
};

class BankAccount extends React.Component {
  constructor(props) {
    super(props);

    this.state = {
      enrolledStudents: 0,
      addEnrolledAmount: 0,
      waitlistedStudents: 0,
      addWaitlistedAmount: 0
    };
  }

  addEnrolled() {
    this.setState({
      enrolledStudents: this.state.enrolledStudents + parseInt(this.state.addEnrolledAmount)
    });
  }

  incrementEnrolled() {
    this.setState({
      enrolledStudents: this.state.enrolledStudents + 1
    });
  }

  addWaitlisted() {
    this.setState({
      waitlistedStudents: this.state.waitlistedStudents + parseInt(this.state.addWaitlistedAmount)
    });
  }

  incrementWaitlisted() {
    this.setState({
      waitlistedStudents: this.state.waitlistedStudents + 1
    });
  }

  render() {
    return (
      <div>
        <h3>Enrolled Students: {this.state.enrolledStudents}</h3>
        <div>
            <button onClick={this.incrementEnrolled.bind(this)}>Increment Students</button>
        </div>
        <br></br>
        <input
          type="number"
          onChange={event => this.setState({ addEnrolledAmount: event.target.value })}
          value={this.state.addEnrolledAmount}
        />
        <button onClick={this.addEnrolled.bind(this)}>Add Students</button>

        <br></br>

        <h3>Waitlisted Students: {this.state.waitlistedStudents}</h3>
        <div>
            <button onClick={this.incrementWaitlisted.bind(this)}>Increment Students</button>
        </div>
        <br></br>
        <input
          type="number"
          onChange={event => this.setState({ addWaitlistedAmount: event.target.value })}
          value={this.state.addWaitlistedAmount}
        />
        <button onClick={this.addWaitlisted.bind(this)}>Add Students</button>
      </div>
    );
  }
}

ReactDOM.render(<App />, document.getElementById('root'));