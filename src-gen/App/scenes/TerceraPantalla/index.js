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
  routeName: 'CuartaPantalla',
  params: {},
  action: {},
});

class TerceraPantalla extends Component {
  static navigationOptions = {
    header: null,
  }
  
  constructor(props) {
    super(props);
    this.initialState = {
      itemSelected2: 'Football',
      username4: '',
      password4: '',
    };
    this.state = this.initialState;
  }
  
  componentDidMount() {
    AsyncStorage.getItem('itemSelected2')
      .then((value) => {
        console.log(value);
        if (value !== null) {
          this.setState({ itemSelected2: value });
        }
      })
      .catch((error) => {
        console.log(error);
      });
    AsyncStorage.getItem('username4')
      .then((value) => {
        console.log(value);
        if (value !== null) {
          this.setState({ username4: value });
        }
      })
      .catch((error) => {
        console.log(error);
      });
    AsyncStorage.getItem('password4')
      .then((value) => {
        console.log(value);
        if (value !== null) {
          this.setState({ password4: value });
        }
      })
      .catch((error) => {
        console.log(error);
      });
  }
  
  saveAndGoForward() {
    AsyncStorage.setItem('itemSelected2', this.state.itemSelected2)
      .then((value) => {
        console.log(value);
      })
      .catch((error) => {
        console.log(error);
      });
    AsyncStorage.setItem('username4', this.state.username4)
      .then((value) => {
        console.log(value);
      })
      .catch((error) => {
        console.log(error);
      });
    AsyncStorage.setItem('password4', this.state.password4)
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
            <Title>Tercera Pantalla</Title>
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
              <Form>
                <Text>Select an option</Text>
                <Picker
                  iosHeader="Select one"
                  mode="dropdown"
                  selectedValue={this.state.itemSelected2}
                  onValueChange={value => this.setState({ itemSelected2: value })}
                >
                <Item label="Football" value="Football" />
                <Item label="Basketball" value="Basketball" />
                <Item label="Tennis" value="Tennis" />
                </Picker>
              </Form>
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
              <Form style={{ flex: 1 }}>
                <Item fixedLabel>
                  <Label>Username</Label>
                  <Input
                    onChangeText={username4 => this.setState({ username4 })}
                    value={this.state.username4}
                  />
                </Item>
                <Item fixedLabel last>
                  <Label>Password</Label>
                  <Input
                    onChangeText={password4 => this.setState({ password4 })}
                    value={this.state.password4}
                    secureTextEntry
                    />
                </Item>
                <Button style={{ alignSelf: 'center', margin: 10 }}>
                  <Text>Log in</Text>
                </Button>
              </Form>
          </View>
          <View style={{
              flex: 1,
              flexDirection: 'row',
              justifyContent: 'flex-start',
              alignItems: 'center',
              margin: 0,
              padding: 0,
            }}
          >
              <Text style={{ fontSize: 16, color: 'black' }}>
                Algo de texto
              </Text>
          </View>
        </Content>
      </Container>
    );
  }
}

export default TerceraPantalla;
