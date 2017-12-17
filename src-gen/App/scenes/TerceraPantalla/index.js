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
  
  async getInputParams(a, b = null, c = null, d = null, e = null) {
    const a1 = a !== null ? await AsyncStorage.getItem(a.key) : null;
    const b1 = b !== null ? await AsyncStorage.getItem(b.key) : null;
    const c1 = c !== null ? await AsyncStorage.getItem(c.key) : null;
    const d1 = d !== null ? await AsyncStorage.getItem(d.key) : null;
    const e1 = e !== null ? await AsyncStorage.getItem(e.key) : null;
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
          </Right>
        </Header>
        <Content>
          <View style={{
              flex: 1,
              flexDirection: 'row',
              justifyContent: 'center',
              alignItems: 'center',
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
        </Content>
      </Container>
    );
  }
}

export default TerceraPantalla;
