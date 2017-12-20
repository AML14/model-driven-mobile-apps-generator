import React, { Component } from 'react';
import {
  Image,
  View,
  ScrollView,
  AsyncStorage,
} from 'react-native';
import {
  Container,
  Header,
  Title,
  Content,
  Icon,
  Button,
  Left,
  Right,
  Body,
  Text,
  Card,
  CardItem,
  List,
  ListItem,
  Item,
  Input,
  Radio,
  Picker,
  Form,
  Label,
} from 'native-base';
import { NavigationActions } from 'react-navigation';

const navBack = NavigationActions.back();
const navForward = NavigationActions.navigate({
  routeName: 'ThirdScreen',
  params: {},
  action: {},
});

class SecondScreen extends Component {
  static navigationOptions = {
    header: null,
  }
  
  constructor(props) {
    super(props);
    this.initialState = {
      inputText2: '',
      inputText4: '',
      radioButton3: false,
      itemSelected5: 'Sports',
    };
    this.state = this.initialState;
  }
  
  componentDidMount() {
    AsyncStorage.getItem('inputText2')
      .then((value) => {
        console.log(value);
        if (value !== null) {
          this.setState({ inputText2: value });
        }
      })
      .catch((error) => {
        console.log(error);
      });
    AsyncStorage.getItem('inputText4')
      .then((value) => {
        console.log(value);
        if (value !== null) {
          this.setState({ inputText4: value });
        }
      })
      .catch((error) => {
        console.log(error);
      });
    AsyncStorage.getItem('radioButton3')
      .then((value) => {
        console.log(value);
        if (value !== null) {
          if (value === 'true') {
            this.setState({ radioButton3: true });
          } else {
            this.setState({ radioButton3: false });
          }
        }
      })
      .catch((error) => {
        console.log(error);
      });
    AsyncStorage.getItem('itemSelected5')
      .then((value) => {
        console.log(value);
        if (value !== null) {
          this.setState({ itemSelected5: value });
        }
      })
      .catch((error) => {
        console.log(error);
      });
  }
  
  saveAndGoForward() {
    AsyncStorage.setItem('inputText2', this.state.inputText2)
      .then((value) => {
        console.log(value);
      })
      .catch((error) => {
        console.log(error);
      });
    AsyncStorage.setItem('inputText4', this.state.inputText4)
      .then((value) => {
        console.log(value);
      })
      .catch((error) => {
        console.log(error);
      });
    AsyncStorage.setItem('radioButton3', this.state.radioButton3.toString())
      .then((value) => {
        console.log(value);
      })
      .catch((error) => {
        console.log(error);
      });
    AsyncStorage.setItem('itemSelected5', this.state.itemSelected5)
      .then((value) => {
        console.log(value);
      })
      .catch((error) => {
        console.log(error);
      });
    this.props.navigation.dispatch(navForward);
  }
  
  // eslint-disable-next-line class-methods-use-this
  async getInputValue(a) {
    let a1 = null;
    if (a !== null) {
      if (a.type !== 'login') {
        a1 = await AsyncStorage.getItem(a.key);
      } else {
        a1 = `${await AsyncStorage.getItem(a.key.split('-')[0])}-${await AsyncStorage.getItem(a.key.split('-')[1])}`;
      }
    }
    return a1;
  }
  
  getInputParams(a, b = null, c = null, d = null, e = null) {
    const a1 = this.getInputValue(a);
    const b1 = this.getInputValue(b);
    const c1 = this.getInputValue(c);
    const d1 = this.getInputValue(d);
    const e1 = this.getInputValue(e);
    return {
      a1,
      b1,
      c1,
      d1,
      e1,
    };
  }

  loadCardContentFromExternalSource(a, b, c, d, e) {
    const {
      a1,
      b1,
      c1,
      d1,
      e1,
    } = this.getInputParams(a, b, c, d, e);
    /**
     * Code for retrieving information from an external source using the params passed.
     * The external source could be a server, for instance, which could perform
     * different operations depending on the params' (a1, b1, c1, d1, e1) type and value.
     */
    return (
      <Card>
        <CardItem header>
          <Text>Card example</Text>
        </CardItem>
        <CardItem>
          <Body>
            <Text>
              Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aliquam
              eleifend leo non felis tristique, ac ullamcorper velit accumsan.
              Sed vitae leo ut urna porta laoreet. Praesent in imperdiet sem,
              ut rhoncus lacus. Praesent ultricies quis purus a euismod.
            </Text>
          </Body>
        </CardItem>
      </Card>
    );
  }
  
  loadListContentFromExternalSource(a, b, c, d, e) {
    const {
      a1,
      b1,
      c1,
      d1,
      e1,
    } = this.getInputParams(a, b, c, d, e);
    /**
     * Code for retrieving information from an external source using the params passed.
     * The external source could be a server, for instance, which could perform
     * different operations depending on the params' (a1, b1, c1, d1, e1) type and value.
     */
    return (
      <ScrollView>
        {/* Las listas deben marcar flex=1 dentro de la vista */}
        <List style={{ flex: 1 }}>
          <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
            <Left style={{ flex: 1 }}>
              <Icon name="information-circle" style={{ color: '#157EFB' }} />
            </Left>
            <Body style={{ flex: 8 }}>
              <Text numberOfLines={1}>Simon Mignolet</Text>
            </Body>
            <Right style={{ flex: 1 }}>
              <Icon name="arrow-forward" />
            </Right>
          </ListItem>
          <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
            <Left style={{ flex: 1 }}>
              <Icon name="information-circle" style={{ color: '#157EFB' }} />
            </Left>
            <Body style={{ flex: 8 }}>
              <Text numberOfLines={1}>Nathaniel Clyne</Text>
            </Body>
            <Right style={{ flex: 1 }}>
              <Icon name="arrow-forward" />
            </Right>
          </ListItem>
          <ListItem style={{ marginLeft: 0, paddingLeft: 15 }}>
            <Left style={{ flex: 1 }}>
              <Icon name="information-circle" style={{ color: '#157EFB' }} />
            </Left>
            <Body style={{ flex: 8 }}>
              <Text numberOfLines={1}>Dejan Lovren</Text>
            </Body>
            <Right style={{ flex: 1 }}>
              <Icon name="arrow-forward" />
            </Right>
          </ListItem>
        </List>
      </ScrollView>
    );
  }

  render() {
    return (
      <Container>
        <Header>
          <Left style={{ flex: 1 }}>
            <Button transparent onPress={() => this.props.navigation.dispatch(navBack)}>
              <Icon name="arrow-back" />
            </Button>
          </Left>
          <Body style={{ flex: 6 }}>
            <Title>Second Screen</Title>
          </Body>
          <Right style={{ flex: 1 }}>
            <Button transparent onPress={() => this.saveAndGoForward()}>
              <Icon name="arrow-forward" />
            </Button>
          </Right>
        </Header>
        <Content>
          <View style={{
              flex: 1,
              flexDirection: 'row',
              justifyContent: 'center',
              alignItems: 'center',
              margin: 0,
              padding: 0,
            }}
          >
              <Item regular>
                <Input
                  placeholder="Post title"
                  onChangeText={inputText2 => this.setState({ inputText2 })}
                  value={this.state.inputText2}
                />
              </Item>
          </View>
          <View style={{
              flex: 1,
              flexDirection: 'row',
              justifyContent: 'center',
              alignItems: 'center',
              margin: 0,
              padding: 0,
            }}
          >
              <Item regular>
                <Input
                  placeholder="Post content"
                  onChangeText={inputText4 => this.setState({ inputText4 })}
                  value={this.state.inputText4}
                />
              </Item>
          </View>
          <View style={{
              flex: 1,
              flexDirection: 'row',
              justifyContent: 'center',
              alignItems: 'center',
              margin: 0,
              padding: 0,
            }}
          >
              <List style={{ flex: 1 }}>
                <ListItem
                  style={{ marginLeft: 0, paddingLeft: 15 }}
                  onPress={() => this.setState({ radioButton3: !this.state.radioButton3 })}
                >
                  <Body style={{ flex: 9 }}>
                    <Text>Publish anonymously</Text>
                  </Body>
                  <Right style={{ flex: 1 }}>
                    <Radio
                      onPress={() => this.setState({ radioButton3: !this.state.radioButton3 })}
                      selected={this.state.radioButton3}
                    />
                  </Right>
                </ListItem>
              </List>
          </View>
          <View style={{
              flex: 1,
              flexDirection: 'row',
              justifyContent: 'center',
              alignItems: 'center',
              margin: 0,
              padding: 0,
            }}
          >
              <Form>
                <Text>Subject</Text>
                <Picker
                  iosHeader="Select one"
                  mode="dropdown"
                  selectedValue={this.state.itemSelected5}
                  onValueChange={value => this.setState({ itemSelected5: value })}
                >
                <Item label="Sports" value="Sports" />
                <Item label="Food" value="Food" />
                <Item label="Free time" value="Free time" />
                <Item label="Work life" value="Work life" />
                <Item label="Relationships" value="Relationships" />
                </Picker>
              </Form>
          </View>
        </Content>
      </Container>
    );
  }
}

export default SecondScreen;
